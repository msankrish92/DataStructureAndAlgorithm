package stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class StackJDK {
	
	private LinkedList<Employee> stack;
	
	public StackJDK() {
		stack = new LinkedList<Employee>();
	}

	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public Employee pop() {
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
