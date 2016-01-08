package template_method;

public class Client {
	public static void main(String[] args) {
		MakeCar jeep = new MakeJeep();
		jeep.make();
	}
}
