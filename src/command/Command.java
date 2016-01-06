package command;

public abstract class Command {
	protected Receiver receiver;
	
	protected String param;
	
	public Command(Receiver receiver,String param){
		this.receiver = receiver;
		this.param = param;
	}
	public abstract void execute(); 
}
