package template_method;

public class MakeJeep extends MakeCar{

	@Override
	void makeHead() {
		System.out.println("make jeep head");
	}

	@Override
	void makeBody() {
		System.out.println("make jeep body");
	}

	@Override
	void makeTail() {
		System.out.println("make jeep tail");
	}

	@Override
	boolean checkMake() {
		return true;
	}

}
