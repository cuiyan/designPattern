package adapter;

public class Test {
	public static void main(String[] args) {
		long exp=5;
		Target t= new Adapter();
		String str = " 2 power "+exp+"=";
		str +=t.get2Power(exp);
		System.out.println(str);
	}
}
