package visitor;

public class Test {
	public static void main(String[] args) {
		Visitor ceo = new CEO();
		Visitor a = new PeopleA();
		Visitor b = new PeopleB();
		Corporation pa = new PartA();
		Corporation pb = new PartB();
		ObjectStructure os = new ObjectStructure();
		os.addVisitor(pa);
		os.addVisitor(pb);
		os.accapt(ceo);
		os.accapt(a);
		os.accapt(b);
	}
}
