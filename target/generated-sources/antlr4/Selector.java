import java.util.ArrayList;

public class Selector {

	private String name;
	private ArrayList<SelectorCondition> conds;

	public Selector(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<SelectorCondition> getConds() {
		return conds;
	}
	
	public void newCondition(SelectorCondition c) {
		conds.add(c);
	}
	
	public String getDesc() {
		if (conds.size() > 0) {
			String temp = "These are this selector's conditions : \n";
			for (SelectorCondition sc : conds) {
				temp +=" " +  sc.getDesc();
			}
			return temp;
		} else {
			return "This is a simple selector!";
		}
	}
}
