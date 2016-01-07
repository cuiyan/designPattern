package iterator;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		depthFirstIterator(createTree());
		System.out.println("");
		breadthFirstIterator(createTree());
		
	}
	
	public static Node createTree(){
		Node node = new BranchNode("Root");
		Node a = new BranchNode("A");
		Node b = new BranchNode("B");
		Node c = new BranchNode("C");
		Node d = new BranchNode("D");
		Node e = new BranchNode("E");
		Node f = new BranchNode("F");
		a.addNode(d);
		d.addNode(e);
		c.addNode(f);
		
		node.addNode(a);
		node.addNode(b);
		node.addNode(c);
		return node;
	}
	public static void depthFirstIterator(Node tree){
		doSomething(tree);
		for(Iterator<Node> it = new DepthFirstIterator(tree.iterator());it.hasNext();){
			doSomething(it.next());
		}
	}
	
	public static void doSomething(Node node){
		System.out.print(node);
		System.out.print(",");
	}
	
	public static void breadthFirstIterator(Node tree){
		doSomething(tree);
		for(Iterator<Node> it = new BreadthFirstIterator(tree.iterator());it.hasNext();){
			doSomething(it.next());
		}
	}
}
