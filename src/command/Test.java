package command;

public class Test {
	public static void main(String[] args) {
		CommandManager commandMgr = new CommandManager();
		Receiver receiver = new Receiver();
		System.out.println("-----------execute command---------------");
		Command commanda = new ConcreteCommand(receiver,"aa");
		commandMgr.executeCommand(commanda);
		Command commandb = new ConcreteCommand(receiver,"bb");
		commandMgr.executeCommand(commandb);
		Command commandc = new ConcreteCommand(receiver,"cc");
		commandMgr.executeCommand(commandc);
		Command commandd = new ConcreteCommand(receiver,"dd");
		commandMgr.executeCommand(commandd);
		System.out.println(receiver.getData());
		System.out.println("-------undo-------");
		commandMgr.undoCommand();
		System.out.println(receiver.getData());
		
	}

}
