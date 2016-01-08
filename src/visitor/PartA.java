package visitor;

public class PartA implements Corporation{
	public String s = "partA";
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	public String getName(){
		return s;
	}
}
