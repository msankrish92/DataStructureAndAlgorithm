package queue;

import java.util.Iterator;
import java.util.LinkedList;

public class StackQueue<T> {

	LinkedList<T> stackQueue = new LinkedList<T>();
	
	public void push(T t) {
		stackQueue.push(t);
	}
	
	public T pop() {
		return stackQueue.pop();
	}
	
	public void add(T t) {
		stackQueue.add(t);
	}
	
	public T peek() {
		return stackQueue.peek();
	}
	
	public T remove() {
		return stackQueue.remove();
	}
	
	public void print() {
		Iterator iterator = stackQueue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	
}
