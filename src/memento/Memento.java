package memento;

public class Memento {
	private int index=0;
	public Memento(int index){
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
}
