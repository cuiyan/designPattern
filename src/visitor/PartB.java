package visitor;

public class PartB implements Corporation{
	public String s = "partB";
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	public String getName(){
		return s;
	}
}
