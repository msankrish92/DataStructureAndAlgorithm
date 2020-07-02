package queue;



public class Main {

	
	public static void main(String[] args) {
	
		Employee em1 = new Employee("Sanjay", "Krishnan", 101);
		Employee em2 = new Employee("Ravi", "m", 102);
		Employee em3 = new Employee("Dev", "Khan", 103);
		Employee em4 = new Employee("Rahul", "Krishnan", 104);
		
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(em1);
		queue.add(em2);
		queue.add(em3);
		queue.add(em4);
		
		queue.printQueue();
		System.out.println("==============REMOVE===============");
		queue.remove();
		queue.printQueue();
		System.out.println("========peek=====================");
		System.out.println(queue.peek());
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println("========EMPTY=============");
		queue.printQueue();
	
	
	}
		
	
}
