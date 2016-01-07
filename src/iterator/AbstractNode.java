package iterator;

import java.util.Iterator;

public abstract class AbstractNode implements Node {
	protected String name;
	protected AbstractNode(String name){
		this.name = name;
	}
	public String toString(){
		return name;
	}
	@Override
	public void addNode(Node node) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
