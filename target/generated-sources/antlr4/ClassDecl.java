import java.util.*;

public class ClassDecl {

	private String name;
	private HashMap<String, AtribDecl> atributes;
	private HashMap<String, MethodDecl> methods;
	
	public ClassDecl(String name) {
		this.name = name;
		atributes = new HashMap<String, AtribDecl>();
		methods = new HashMap<String, MethodDecl>();
	}

	public String getName() {
		return name;
	}

	public void addAtrib(String name, String className, String privacy) {
		atributes.put(name, new AtribDecl(name, className, privacy));
	}

	public String getAtribClass(String name) {
		if (!atributes.containsKey(name)) {
			return "Object";
		}
		String cls = atributes.get(name).getClassName();
		String[] str = cls.split("<|>");
		return str[str.length - 1];
	}

	public String getAtribPrivacy(String name) {
		return atributes.get(name).getPrivacy();
	}

	public void addMethod(String name, String className, String privacy) {
		methods.put(name, new MethodDecl(name, className, privacy));
	}

	public String getMethodReturnClass(String name) {
		if (methods.containsKey(name)) {

			return methods.get(name).getClassReturnName();
		} else {
			return null;
		}
	}

	public String getMethodPrivacy(String name) {
		return methods.get(name).getPrivacy();
	}

	public boolean getIsArray(String name) {
		String cls = atributes.get(name).getClassName();
		String[] str = cls.split("<|>");
		return str.length > 1;
	}
}

