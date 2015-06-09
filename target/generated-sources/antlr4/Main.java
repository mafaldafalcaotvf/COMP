import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class Main {

	public static void main(String[] args) throws IOException {
		String inputFile = null;
		if(args.length > 0) inputFile = args[0];
		InputStream in = System.in;
		if(inputFile != null) in = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(in);
		jQueryLexer lexer = new jQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		jQueryParserParser parser = new jQueryParserParser(tokens);
		ParserRuleContext tree = parser.start();
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
		
		MyjQueryListener extractor = new MyjQueryListener();
		walker.walk(extractor, tree);
		
		JFrame frame = new JFrame("Antlr Tree");
		JPanel panel = new JPanel();
		viewer.setScale(1.5);
		panel.add(viewer);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
}