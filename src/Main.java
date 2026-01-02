import python.ast.Program;
import python.symbolTable.Symbol;
import python.symbolTable.SymbolTable;
import python.visitor.visitorAst;
import python.generated.pythonLexer;
import python.generated.pythonParser;

import html.ast.Node;
import html.visitor.AstBuilder;
import html.generated.HTMLLexer;
import html.generated.HTMLParser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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
        String sourcePython = "Tests/PYTHON/test3.txt";
        String pythonCode = Files.readString(Path.of(sourcePython));
        CharStream pyInput = CharStreams.fromString(pythonCode);
        pythonLexer pyLexer = new pythonLexer(pyInput);
        CommonTokenStream pyTokens = new CommonTokenStream(pyLexer);
        pythonParser pyParser = new pythonParser(pyTokens);
        ParseTree pyTree = pyParser.file_input();
        visitorAst pyVisitor = new visitorAst();
        Program pyAst = (Program) pyVisitor.visit(pyTree);
        System.out.println("AST Python (Flask):");
        System.out.println(pyAst);
        System.out.println("------------------------------------------------------------");
        System.out.println("Parse Tree Python:");
        System.out.println(pyTree.toStringTree(pyParser));
        System.out.println("------------------------------------------------------------");

        System.out.println();

        String sourceHtml = "Tests/HTML + JINJA + CSS/test3.txt";
        String htmlCode = Files.readString(Path.of(sourceHtml));
        CharStream htmlInput = CharStreams.fromString(htmlCode);
        HTMLLexer htmlLexer = new HTMLLexer(htmlInput);
        CommonTokenStream htmlTokens = new CommonTokenStream(htmlLexer);
        HTMLParser htmlParser = new HTMLParser(htmlTokens);
        ParseTree htmlTree = htmlParser.htmlDocument();
        AstBuilder htmlVisitor = new AstBuilder();
        Node htmlAst = htmlVisitor.visit(htmlTree);
        System.out.println("AST HTML (CSS+JINJA):");
        if (htmlAst != null) {
            System.out.println(htmlAst.prettyPrint(0));
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Parse Tree HTML:");
        System.out.println(htmlTree.toStringTree(htmlParser));
        System.out.println("------------------------------------------------------------");

        System.out.println();

        System.out.println("Symbol table python (Flask):");
        SymbolTable rootTable = pyVisitor.symbolTable;
        while (rootTable.getParent() != null) {
            rootTable = rootTable.getParent();
        }
        pyVisitor.symbolTable.printTable();
        System.out.println("------------------------------------------------------------");
        System.out.println("Symbol table HTML:");
        System.out.println("Symbol table HTML (Tags + Jinja + CSS):");
        htmlVisitor.htmlST.printTable();
        System.out.println("------------------------------------------------------------");
        System.out.println("THE END");

        //this to check from parse tree for python because we used custom logic
        showParseTree(pythonCode, pyTree, pyParser);

        //we do not need this, we can test parse tree for html in antlr preview
        //showParseTree(htmlCode, htmlTree, htmlParser);
    }

    private static void showParseTree(String code, ParseTree parseTree, Parser parser) {
        JFrame frame = new JFrame("ANTLR Parse Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        JTextArea codeArea = new JTextArea(code);
        codeArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        codeArea.setEditable(false);
        JScrollPane codeScroll = new JScrollPane(codeArea);
        JTree tree = new JTree(new DefaultTreeModel(buildNode(parseTree, parser)));
        expandAll(tree);
        JScrollPane treeScroll = new JScrollPane(tree);
        tree.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
            if (node == null)
                return;
            Object obj = node.getUserObject();
            if (!(obj instanceof NodeData data))
                return;
            List<Token> tokens = new ArrayList<>();
            collectTokens(data.tree, tokens);
            if (tokens.isEmpty())
                return;
            int start = tokens.get(0).getStartIndex();
            int stop = tokens.get(tokens.size() - 1).getStopIndex() + 1;
            int len = codeArea.getDocument().getLength();
            start = Math.min(start, len);
            stop = Math.min(stop, len);
            codeArea.requestFocus();
            codeArea.setCaretPosition(start);
            codeArea.moveCaretPosition(stop);
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

