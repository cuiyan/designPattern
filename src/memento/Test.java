package memento;

public class Test {
	private static Originator ori = new Originator();
	private static Caretaker taker = new Caretaker();
	public static void main(String[] args) {
		ori.setIndex(1);
		System.out.println(ori.getIndex());
		taker.saveMemento(ori.createMemento());
		
		ori.setIndex(2);
		System.out.println(ori.getIndex());
		taker.saveMemento(ori.createMemento());
		
		ori.setIndex(3);
		System.out.println(ori.getIndex());
		ori.restoreMemento(taker.retrieveMemento());
		
		System.out.println("amigo 当前情况: " + ori.getIndex());

	}
}
