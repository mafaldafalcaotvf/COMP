import java.util.*;


public class MethodDecl {
	private String name;
	private String cName;
	private String priv;
	
	public MethodDecl(String name, String cName, String priv) {
		this.name=name;
		this.cName=cName;
		this.priv=priv;
	}

	public String getClassReturnName() {
		
		return cName;
	}

	public String getPrivacy() {
		return priv;
	}

}
