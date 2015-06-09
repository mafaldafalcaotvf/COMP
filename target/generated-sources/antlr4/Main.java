import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class Main {
	
	static TreeViewer viewr;
	static ArrayList<CodeBlock> representation;
	static HashMap<String, ClassDecl> classes;
	static int count=0;

	public static void main(String[] args) throws IOException {
		String inputFile = null;
		
		if(args.length > 0) 
			inputFile = args[0];
		
		InputStream in = System.in;
		if(inputFile != null) 
			in = new FileInputStream(inputFile);
		
		ANTLRInputStream input = new ANTLRInputStream(in);
		jQueryLexer lexer = new jQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		//chamar metodos dos erros sintaticos
		jQueryParserParser parser = new jQueryParserParser(tokens);
		ParserRuleContext tree = parser.start();
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		//chamar metodos erros semanticos
		TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
		
		representation = new ArrayList<CodeBlock>();
		MyjQueryListener extractor = new MyjQueryListener();
		walker.walk(extractor, tree);
		
		for (CodeBlock block : representation) {
			block.processToJava();
		}
		
		writingOnFile(inputFile, "test.txt", representation);
		
		JFrame frame = new JFrame("Antlr Tree");
		JPanel panel = new JPanel();
		viewer.setScale(1.5);
		panel.add(viewer);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}

	private static void writingOnFile(String inputFile, String filename,
			ArrayList<CodeBlock> representation2) 
	{
		Scanner sc;
		Scanner scanner = null;
		PrintWriter print = null;
		
		/*try
		{
			sc = new Scanner(new File(filename));
			print = new PrintWriter(new File(filename));
			sc.useDelimiter("<-@JQ");
			String firstPart = sc.next();
			print.print(firstPart);
			int i =0;
			while(sc.hasNext()){
			String codigomisto = sc.next();
			
			//codigo traduzido
			ArrayList<Declaration> dec = representation2.get(i).getDeclarations();
			for(Declaration decla : dec){
				String declaration = decla.getJavaCodeBlock();
				if(declaration!=null){
				print.print(decla.getJavaCodeBlock());
				}
			}
			scanner = new Scanner(codigomisto);
			scanner.useDelimiter("@JQ->");
			scanner.next();
			String next1 = scanner.next();
			print.print(next1);
			i++;
			
			}
			sc.close();
			scanner.close();
			print.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}
	
}