import java.util.*;

public class CodeBlock {
	
	private int firstLine;
	private int lastLine;
	
	private ArrayList<Declaration> declarations;
	
	
	public CodeBlock(int firstLine, int lastLine)
	{
		this.firstLine = firstLine;
		this.lastLine = lastLine;
		declarations = new ArrayList<Declaration> ();
	}

	public void newDeclaration(Declaration d)
	{
		declarations.add(d);
	}
	
	public int getFirstLine() {
		return firstLine;
	}

	
	public int getLastLine() {
		return lastLine;
	}

	
	public ArrayList<Declaration> getDeclarations() {
		return declarations;
	}

	public void print() {
		System.out.println("This block starts at line: " + firstLine
				+ "and ends at " + lastLine + " : ");
		for (Declaration declaration : declarations) {
			System.out.println(declaration.getDesc());
		}
	}

	public void processToJava() {
		for (Declaration declaration : declarations) {
			declaration.processToJava();
		}
		
	}
}
