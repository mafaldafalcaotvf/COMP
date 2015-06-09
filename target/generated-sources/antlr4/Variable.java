public class Variable {
	private String name;
	private boolean init;
	private String classType;
	
	public Variable(String name, boolean init)
	{
		this.name=name;
		this.init=init;
	}
	
	public String getClassType()
	{
		return classType;
	}
	
	public boolean isInit()
	{
		return init;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setInit()
	{
		init = true;
	}
}
