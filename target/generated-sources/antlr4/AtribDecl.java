import java.util.*;


public class AtribDecl {
	private String name;
	private String cName;
	private String priv;

	public AtribDecl(String name, String cName, String priv) {
		this.name=name;
		this.cName=cName;
		this.priv=priv;
	}

	public String getPrivacy() {
		return priv;
	}

	public String getClassName() {
		return cName;
	}

}
