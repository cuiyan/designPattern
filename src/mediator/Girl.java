package mediator;

public class Girl extends Person{

	public Girl(Mediator mediator, String name, int condition) {
		super(mediator, name, condition);
		mediator.registGirl(this);
	}

	@Override
	public boolean findPartner(Person person) {
		System.out.println("girl try to find boy.");
		return mediator.findPartner(person);
	}

}
