import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;

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
		ParserRuleContext tree = parser.main();
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
														
		MyjQueryListener extractor = new MyjQueryListener();
		walker.walk(extractor, tree);
	}
	
}