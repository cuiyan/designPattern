package command;

public class Receiver {
	private String data="";
	public void append(String expr){
		data+=expr;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
