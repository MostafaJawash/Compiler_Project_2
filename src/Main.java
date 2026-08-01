import generation.SemanticReportBuilder;
import python.ast.Program;
import python.visitor.PythonAdvancedSemanticChecker;
import python.visitor.visitorAst;
import python.generated.pythonLexer;
import python.generated.pythonParser;
import html.ast.Node;
import html.visitor.AstBuilder;
import html.visitor.HtmlJinjaCssSemanticChecker;
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

public class Main {
    private static final boolean SHOW_PARSE_TREE = true;
    private static final boolean RUN_SEMANTIC_ERROR_DEMO = true; // true -> semantic error - false -> basic output

    static class NodeData {
        String label;
        ParseTree tree;
        NodeData(String label, ParseTree tree) { this.label = label; this.tree = tree; }
        @Override public String toString() { return label; }
    }

    public static void main(String[] args) throws IOException {
        String sourcePython = RUN_SEMANTIC_ERROR_DEMO
                ? "Tests/PYTHON/Semantic tests/python_semantic_errors.txt"
                : "Tests/PYTHON/Final tests/app.txt";

        String pythonCode = Files.readString(Path.of(sourcePython));
        pythonParser pyParser = new pythonParser(new CommonTokenStream(new pythonLexer(CharStreams.fromString(pythonCode))));
        ParseTree pyTree = pyParser.file_input();
        visitorAst pyVisitor = new visitorAst();
        Program pyAst = (Program) pyVisitor.visit(pyTree);

        if (!RUN_SEMANTIC_ERROR_DEMO) {
            System.out.println("AST Python (Flask):\n" + pyAst);
            System.out.println("------------------------------------------------------------");
            System.out.println("Parse Tree Python:\n" + pyTree.toStringTree(pyParser));
            System.out.println("------------------------------------------------------------");
        }

        PythonAdvancedSemanticChecker pythonChecker = new PythonAdvancedSemanticChecker();
        HtmlJinjaCssSemanticChecker htmlChecker = new HtmlJinjaCssSemanticChecker(pyAst);

        if (RUN_SEMANTIC_ERROR_DEMO) {
            pythonChecker.check(pyAst);
            System.out.println("Executing Advanced Semantic Analysis Pipeline...");
        }

        String[] htmlPaths = RUN_SEMANTIC_ERROR_DEMO
                ? new String[]{"Tests/HTML + JINJA + CSS/Semantic tests/semantic_template.txt"}
                : new String[]{"Tests/HTML + JINJA + CSS/Final tests/index.txt", "Tests/HTML + JINJA + CSS/Final tests/add.txt", "Tests/HTML + JINJA + CSS/Final tests/details.txt"};

        AstBuilder firstHtmlVisitor = null;
        for (String htmlPath : htmlPaths) {
            String htmlCode = Files.readString(Path.of(htmlPath));
            String templateName = Path.of(htmlPath).getFileName().toString();

            HTMLParser htmlParser = new HTMLParser(new CommonTokenStream(new HTMLLexer(CharStreams.fromString(htmlCode))));
            AstBuilder htmlVisitor = new AstBuilder();
            Node htmlAst = htmlVisitor.visit(htmlParser.htmlDocument());
            if (RUN_SEMANTIC_ERROR_DEMO) htmlChecker.checkTemplate(templateName, htmlAst);
            if (firstHtmlVisitor == null) firstHtmlVisitor = htmlVisitor;
        }

        if (RUN_SEMANTIC_ERROR_DEMO) {
            printUnifiedSemanticReport(pythonChecker, htmlChecker);
        }

        // --- طباعة جداول الرموز ---
        System.out.println("Symbol table python (Flask):");
        pyVisitor.symbolTable.printTable();

        // التعديل هنا: لن يظهر جدول HTML إلا في الوضع السليم (false)
        if (firstHtmlVisitor != null && !RUN_SEMANTIC_ERROR_DEMO) {
            System.out.println("\n=====================================================================================");
            System.out.println("Symbol table HTML/Jinja/CSS:");
            System.out.println("=====================================================================================");
            firstHtmlVisitor.htmlST.printTable();
        }

        if (SHOW_PARSE_TREE) SwingUtilities.invokeLater(() -> showParseTree(pythonCode, pyTree, pyParser));
    }

    private static void printUnifiedSemanticReport(PythonAdvancedSemanticChecker pythonChecker,
                                                   HtmlJinjaCssSemanticChecker htmlChecker) {
        System.out.print(SemanticReportBuilder.build(pythonChecker, htmlChecker));
    }

    private static void showParseTree(String code, ParseTree parseTree, Parser parser) {
        JFrame frame = new JFrame("ANTLR Parse Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        JTextArea codeArea = new JTextArea(code);
        codeArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        JScrollPane codeScroll = new JScrollPane(codeArea);
        JTree tree = new JTree(new DefaultTreeModel(buildNode(parseTree, parser)));
        expandAll(tree);
        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(tree), codeScroll);
        split.setDividerLocation(450);
        frame.add(split);
        frame.setVisible(true);
    }

    private static DefaultMutableTreeNode buildNode(ParseTree tree, Parser parser) {
        String label = (tree instanceof RuleNode r) ? parser.getRuleNames()[r.getRuleContext().getRuleIndex()] : tree.getText();
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(new NodeData(label, tree));
        for (int i = 0; i < tree.getChildCount(); i++) node.add(buildNode(tree.getChild(i), parser));
        return node;
    }

    private static void expandAll(JTree tree) {
        for (int i = 0; i < tree.getRowCount(); i++) tree.expandRow(i);
    }
}