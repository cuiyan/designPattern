package iterator;

import java.util.Iterator;
import java.util.Stack;

public class DepthFirstIterator implements Iterator<Node>{
	private Stack<Iterator<Node>> stack = new Stack<Iterator<Node>>();
	
	public DepthFirstIterator(Iterator<Node> it) {
		stack.push(it);
	}

	
	@Override
	public boolean hasNext() {
		if(stack.isEmpty()){
			return false;
		}else{
			Iterator<Node> it = stack.peek();
			if(it.hasNext()){
				return true;
			}else{
				stack.pop();
				return hasNext();
			}
		}
	}

	@Override
	public Node next() {
		if(hasNext()){
			Iterator<Node> it = stack.peek();
			Node next = it.next();
			if(next instanceof BranchNode){
				stack.push(next.iterator());
			}
			return next;
		}else{
			return null;	
		}
	}
	
	public void remove(){
		throw new UnsupportedOperationException("Cant't remove node ,yet");
	}
}
