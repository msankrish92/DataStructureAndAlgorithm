package stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class StringStack<T> {

	private LinkedList<T> stack;
	
	public StringStack() {
		stack = new LinkedList<T>();
	}

	public void push(T employee) {
		stack.push(employee);
	}
	
	public T peek() {
		return stack.peek();
	}
	
	public T pop() {
		return stack.pop();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator iterator = stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

	
	
}
