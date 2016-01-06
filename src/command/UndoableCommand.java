package command;

public abstract class UndoableCommand extends Command{

	public UndoableCommand(Receiver receiver, String param) {
		super(receiver, param);
		// TODO Auto-generated constructor stub
	}
	public abstract void undo();
}
