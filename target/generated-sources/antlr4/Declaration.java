import java.util.*;

public class Declaration {

protected String javaCodeBlock;
	
	public String getDesc(){
		return "Declaration";
	}

	public void processToJava() {
		javaCodeBlock = "Extendig class problems";
	}


	public String getJavaCodeBlock() {
		return javaCodeBlock;
	}
	
	public enum type {
		NEW,REDECLARATION,REUSE
	}

}
