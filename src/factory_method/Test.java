package factory_method;

public class Test {
	public static void main(String[] args) {
		Human whiteHuman1 = Factory.createHuman(WhiteHuman.class);
		System.out.println(whiteHuman1);
		
		Human whiteHuman2 = Factory.createHuman(WhiteHuman.class);
		System.out.println(whiteHuman2);
		
		
		Human YellowHuman1 = Factory.createHuman(YellowHuman.class);
		System.out.println(YellowHuman1);

		Human YellowHuman2 = Factory.createHuman(YellowHuman.class);
		System.out.println(YellowHuman2);

	}
}
