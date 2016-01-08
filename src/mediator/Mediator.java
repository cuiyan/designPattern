package mediator;

public class Mediator {
	Boy boy;
	Girl girl;
	//ÄÐº¢×¢²á
	public void registBoy(Boy boy){
		this.boy = boy;
	}
	//Å®º¢×¢²á
	public void registGirl(Girl girl){
		this.girl = girl;
	}
	
	public boolean findPartner(Person person){
		if(person instanceof Boy){
			this.boy = (Boy)person;
		}else{
			this.girl = (Girl)person;
		}
		boolean net =(this.boy.getCondition() == this.girl.getCondition());
		System.out.println(this.boy.getName()+"&"+this.girl.getName()+" is partner:"+net);
		return net;
	}
}
