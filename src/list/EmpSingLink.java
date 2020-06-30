package list;

public class EmpSingLink {

	public static void main(String[] args) {

		SingleLinkedList list = new SingleLinkedList();

		list.addToFront(new Employee("Sanjay", "Krishnan", 101));
		list.addToFront(new Employee("Ravi", "m", 101));
		list.addToFront(new Employee("Dev", "Khan", 101));
		list.addToFront(new Employee("Rahul", "Krishnan", 101));

		list.addToFront(new Employee("keep", "going", 101));

		list.removeFromFront();

		list.printList();
		System.out.println(list.getSize());

		System.out.println(list.isEmpty());
	}

}
