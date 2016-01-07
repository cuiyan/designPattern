package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BranchNode extends AbstractNode {
	private Collection<Node> childs = new ArrayList<Node>();
	protected BranchNode(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addNode(Node node) {
		childs.add(node);
	}

	@Override
	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return childs.iterator();
	}
}
