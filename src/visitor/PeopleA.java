package visitor;

public class PeopleA implements Visitor {

	@Override
	public void visit(PartA partA) {
		System.out.println("partAÖ÷¹Ü"+partA.getName());
	}

	@Override
	public void visit(PartB partB) {
		// TODO Auto-generated method stub

	}

}
