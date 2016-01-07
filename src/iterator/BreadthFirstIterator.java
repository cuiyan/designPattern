package iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstIterator implements Iterator<Node> {
	private Queue<Iterator<Node>> queue = new LinkedList<Iterator<Node>>();
	public BreadthFirstIterator(Iterator<Node> it){
		queue.offer(it);
	}
	@Override
	public boolean hasNext() {
		if(queue.isEmpty()){
			return false;
		}else{
			Iterator<Node> it = queue.peek();
			if(it.hasNext()){
				return true;
			}else{
				queue.poll();
				return hasNext();
			}
		}
	}

	@Override
	public Node next() {
		if(hasNext()){
			Iterator<Node> it = queue.peek();
			Node next = it.next();
			if(next instanceof BranchNode){
				queue.offer(next.iterator());
			}
			return next;
		}else{
			return null;
		}
	}
	public void remove(){
		throw new UnsupportedOperationException("Cann't remove node ,yet");
	}
}
