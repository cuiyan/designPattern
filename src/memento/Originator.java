package memento;

public class Originator {
	private int index=0;
	public Memento createMemento(){
		return new Memento(index);
	}
	
	public void restoreMemento(Memento memento){
		this.index = memento.getIndex();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
