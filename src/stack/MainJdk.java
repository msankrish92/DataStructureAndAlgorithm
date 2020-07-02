package stack;

public class MainJdk {

	public static void main(String[] args) {
		
		StackJDK stack = new StackJDK();
		
		Employee em1 = new Employee("Sanjay", "Krishnan", 101);
		Employee em2 = new Employee("Ravi", "m", 102);
		Employee em3 = new Employee("Dev", "Khan", 103);
		Employee em4 = new Employee("Rahul", "Krishnan", 104);
		
		stack.push(em1);
		stack.push(em2);
		stack.push(em3);
		stack.push(em4);
		
		stack.printStack();
		
		System.out.println("============peek============");
		System.out.println(stack.peek());
		System.out.println("============pop=============");
		System.out.println(stack.pop());
		System.out.println("=============================");
		stack.printStack();
		System.out.println("============peek============");
		System.out.println(stack.peek());
		
	}
	
}
