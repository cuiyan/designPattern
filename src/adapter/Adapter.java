package adapter;

public class Adapter implements Target {
	private Adaptee pt;
	public Adapter(){
		pt = new Adaptee();
	}
	public long get2Power(long exp){
		return pt.getPower(exp,2);
	}

}
