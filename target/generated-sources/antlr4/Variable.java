public class Variable {
	private String name;
	private boolean init;
	
	public Variable(String name, boolean init)
	{
		this.name=name;
		this.init=init;
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
