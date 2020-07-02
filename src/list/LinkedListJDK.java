package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListJDK {
	
	public static void main(String[] args) {
		Employee em1 = new Employee("Sanjay", "Krishnan", 101);
		Employee em2 = new Employee("Ravi", "m", 102);
		Employee em3 = new Employee("Dev", "Khan", 103);
		Employee em4 = new Employee("Rahul", "Krishnan", 104);
		
		LinkedList<Employee> list = new LinkedList<>();
		
		list.addFirst(em1);
		list.addFirst(em2);
		list.addFirst(em3);
		list.addFirst(em4);
		list.add(em4);
		
		System.out.println(list);
	}

}
