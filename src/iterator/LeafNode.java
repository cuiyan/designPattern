package iterator;

import java.util.Iterator;

public class LeafNode extends AbstractNode{

	protected LeafNode(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addNode(Node node) {
		throw new UnsupportedOperationException("Cant'n add a node to leaf");
	}

	
}
