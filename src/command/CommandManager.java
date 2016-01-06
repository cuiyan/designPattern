package command;

import java.util.Stack;

public class CommandManager {
	private Stack commandStack = new Stack();
	public void executeCommand(Command cmd){
		cmd.execute();
		if(cmd instanceof UndoableCommand){
			commandStack.push(cmd);
		}
	}
	
	public void undoCommand(){
		if(commandStack.size()>0){
			UndoableCommand cmd = (UndoableCommand) commandStack.pop();
			cmd.undo();
		}else{
			throw new UnsupportedOperationException();
		}
	}
}
