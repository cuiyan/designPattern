package mediator;

public class Test {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Boy zhangsan = new Boy(mediator,"zhangsan",80);
		Girl lili = new Girl(mediator,"lili",80);
		zhangsan.findPartner(lili);
		
		Girl lanlan = new Girl(mediator,"lanlan",90);
		lanlan.findPartner(zhangsan);
	}
}
