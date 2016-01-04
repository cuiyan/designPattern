package factory_method;

public class YellowHuman extends Human{
	
	private YellowHuman(){
		
	}
	@Override
	public void doSomething() {
		System.out.println("黄种人，大部分住在亚洲");
	}

}
