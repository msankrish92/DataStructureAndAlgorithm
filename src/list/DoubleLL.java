package list;

public class DoubleLL {

	public static void main(String[] args) {
		
		
		Employee em1 = new Employee("Sanjay", "Krishnan", 101);
		Employee em2 = new Employee("Ravi", "m", 102);
		Employee em3 = new Employee("Dev", "Khan", 103);
		Employee em4 = new Employee("Rahul", "Krishnan", 104);
		
		DoubleLinkedList dll = new DoubleLinkedList();
		
		dll.addToFront(em1);
		dll.addToFront(em2);
		dll.addToFront(em3);
		dll.addToFront(em4);
		
//		dll.printList();
		
		Employee em5 = new Employee("add", "toEnd", 105);
		
//		dll.addToEnd(em5);
//		dll.printList();
		
//		dll.removeFromFront();		
//		dll.printList();
		
//		dll.removeFromEnd();		
		dll.printList();
		
		dll.addBefore(em5, em4);
		dll.printList();
		
	}
	
}
