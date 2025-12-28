import python.ast.Program;
import python.visitor.visitorAst;
import python.generated.pythonLexer;
import python.generated.pythonParser;
import html.generated.HTMLLexer;
import html.generated.HTMLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import python.symbolTable.SymbolTable;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static class NodeData {
        String label;
        ParseTree tree;

        NodeData(String label, ParseTree tree) {
            this.label = label;
            this.tree = tree;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    public static void main(String[] args) throws IOException {
        String sourcePython = "Tests/PYTHON/test1.txt";
        String code = Files.readString(Path.of(sourcePython));
        CharStream input = CharStreams.fromString(code);
        pythonLexer lexer = new pythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pythonParser parser = new pythonParser(tokens);
        ParseTree parseTree = parser.file_input();
        visitorAst visitor = new visitorAst();
        Program ast = (Program) visitor.visit(parseTree);
        System.out.println();
        System.out.println("=== Symbol Table Results ===");
        visitor.symbolTable.printTable();
        System.out.println("============================");
        System.out.println("=== AST Python ===");
        System.out.println(ast);
        System.out.println("=================");
        System.out.println();
        System.out.println("=== Parse Tree Python ===");
        System.out.println(parseTree.toStringTree(parser));
        System.out.println("=================");

        System.out.println();
        System.out.println();
        System.out.println();

        String sourceHtml = "Tests/HTML + JINJA + CSS/test1.txt";
        String codeHtml = Files.readString(Path.of(sourceHtml));
        CharStream inputHtml = CharStreams.fromString(codeHtml);
        HTMLLexer lexerHtml = new HTMLLexer(inputHtml);
        CommonTokenStream tokensHtml = new CommonTokenStream(lexerHtml);
        HTMLParser parserHtml = new HTMLParser(tokensHtml);
        ParseTree parseTreeHtml = parserHtml.htmlDocument();
        System.out.println("=== Parse Tree HTML ===");
        System.out.println(parseTreeHtml.toStringTree(parserHtml));
        System.out.println("=================");

        showParseTree(codeHtml, parseTreeHtml,parserHtml);//html
        showParseTree(code, parseTree,parser);//python


        /*int test=0;
        for (int i = 0; i < tokens.size(); i++) {
            Token t = tokens.get(i);
            String text = t.getText();
            if (t.getType() == pythonLexer.INDENT){ text = "INDENT"; test++;}
            else if (t.getType() == pythonLexer.DEDENT) {text = "DEDENT"; test--;}
            else if (t.getType() == pythonLexer.NEWLINE) text = "NEWLINE";
            System.out.println(text);
        }
        System.out.println(test);*/
    }

    private static void showParseTree(String code,ParseTree parseTree,Parser parser){
        JFrame frame = new JFrame("ANTLR Tree Code (Highlight Statement)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        JTextArea codeArea = new JTextArea(code);
        codeArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        codeArea.setEditable(false);
        JScrollPane codeScroll = new JScrollPane(codeArea);
        JTree tree = new JTree(new DefaultTreeModel(buildNode(parseTree,parser)));
        expandAll(tree);
        JScrollPane treeScroll = new JScrollPane(tree);
        JTree finalTree = tree;
        tree.addTreeSelectionListener(e -> {DefaultMutableTreeNode node = (DefaultMutableTreeNode) finalTree.getLastSelectedPathComponent();
            if (node == null) return;
            Object obj = node.getUserObject();
            if (!(obj instanceof NodeData data)) return;
            ParseTree pt = data.tree;
            List<Token> tokensList = new ArrayList<>();
            collectTokens(pt, tokensList);
            if (tokensList.isEmpty()) return;
            int startIndex = tokensList.get(0).getStartIndex();
            int stopIndex  = tokensList.get(tokensList.size() - 1).getStopIndex() + 1;
            int docLen = codeArea.getDocument().getLength();
            startIndex = Math.min(startIndex, docLen);
            stopIndex  = Math.min(stopIndex, docLen);
            codeArea.requestFocus();
            codeArea.setCaretPosition(startIndex);
            codeArea.moveCaretPosition(stopIndex);
        });
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeScroll, codeScroll);
        split.setDividerLocation(450);
        frame.add(split);
        frame.setVisible(true);
    }

    private static DefaultMutableTreeNode buildNode(ParseTree tree, Parser parser) {
        String label;
        if (tree instanceof RuleNode r) {
            label = parser.getRuleNames()[r.getRuleContext().getRuleIndex()];
        } else {
            label = tree.getText();
        }
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(new NodeData(label, tree));
        for (int i = 0; i < tree.getChildCount(); i++) {
            node.add(buildNode(tree.getChild(i), parser));
        }
        return node;
    }
    private static void expandAll(JTree tree) {
        for (int i = 0; i < tree.getRowCount(); i++) {
            tree.expandRow(i);
        }
    }
    private static void collectTokens(ParseTree tree, List<Token> tokens) {
        if (tree instanceof TerminalNode tn) {
            Token tok = tn.getSymbol();
            if (tok != null) tokens.add(tok);
        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            collectTokens(tree.getChild(i), tokens);
        }
    }

}