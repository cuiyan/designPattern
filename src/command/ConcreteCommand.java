package command;

public  class ConcreteCommand extends UndoableCommand{
	private String previousDate = null;
	public ConcreteCommand(Receiver receiver, String param) {
		super(receiver, param);
		// TODO Auto-generated constructor stub
	}
	public void execute(){
		previousDate = receiver.getData();
		receiver.append(this.param);
	}
	
	public void undo(){
		receiver.setData(previousDate);
	}
}
