package mediator;

public abstract class Person {
	String name;
	int condition;
	Mediator mediator; 
	
	public Person(Mediator mediator,String name,int condition){
		this.mediator = mediator;
		this.name = name;
		this.condition = condition;
	}
	
	public abstract boolean findPartner(Person person);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}
	
}
