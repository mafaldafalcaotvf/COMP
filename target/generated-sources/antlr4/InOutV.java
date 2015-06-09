public class InOutV {

	private String nome;
	private boolean inVar;
	private boolean usada;
	private boolean full;
	
	public InOutV(String nome){
		this.nome=nome;
		usada=false;
		inVar=false;
		full=false;
	}
	@Override
	public boolean equals(Object obj) {
		return nome.equals((String) obj);
	}
	
	public boolean isInput(){
		return inVar;
	}
	public boolean isOutput(){
		return !inVar;
	}
	public void setAsInput(){
		usada=false;
		inVar=true;
	}
	public void setAsOutput(){
		usada=false;
		inVar=false;
	}
	public void setAsUsada(){
		usada=true;
	}
	public void setAsFull(){
		full=true;
	}
	public void setAsEmpty(){
		full=false;
	}
	public boolean isUsada(){
		return usada;
	}
	public String getName(){
		return nome;
	}
	public boolean isFull(){
		return full;
	}
}