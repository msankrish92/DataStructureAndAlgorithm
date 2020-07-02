package queue;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee em1 = new Employee("Sanjay", "Krishnan", 101);
		Employee em2 = new Employee("Ravi", "m", 102);
		Employee em3 = new Employee("Dev", "Khan", 103);
		Employee em4 = new Employee("Rahul", "Krishnan", 104);
		
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(em4);
		queue.add(em1);
		queue.remove();
		queue.add(em2);
		queue.remove();
		queue.add(em3);
		queue.remove();
		queue.add(em4);
		queue.remove();
		queue.add(em1);
		queue.remove();
		queue.add(em2);
		queue.remove();
		queue.add(em3);
		queue.remove();
		queue.add(em4);
		queue.remove();
		queue.add(em1);
		queue.remove();
		queue.add(em2);
		queue.remove();
		queue.add(em3);
		queue.remove();
		queue.add(em4);
		queue.remove();
		
		queue.printQueue();
		
	}
	
}
