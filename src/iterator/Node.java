package iterator;

import java.util.Iterator;

public interface Node {
	public void addNode(Node node);
	Iterator<Node> iterator();
}
