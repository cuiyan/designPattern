package mediator;

public class Boy extends Person{

	public Boy(Mediator mediator, String name, int condition) {
		super(mediator, name, condition);
		mediator.registBoy(this);
	}

	@Override
	public boolean findPartner(Person person) {
		System.out.println("boy try to find girl.");
		return mediator.findPartner(person);
	}

}
