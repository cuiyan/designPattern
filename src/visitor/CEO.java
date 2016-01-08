package visitor;

public class CEO implements Visitor {

	@Override
	public void visit(PartA partA) {
		System.out.println("CEO主管："+partA.getName());
	}

	@Override
	public void visit(PartB partB) {
		System.out.println("CEO主管："+partB.getName());
	}

}
