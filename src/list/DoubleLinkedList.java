package list;

import org.omg.CORBA.Current;

public class DoubleLinkedList {

	private DoubleEmployeeNode head;
	private DoubleEmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		DoubleEmployeeNode node = new DoubleEmployeeNode(employee);
		node.setNext(head);

		if (head == null) {
			tail = node;
		} else {
			head.setPrevious(node);
		}

		head = node;
		size++;
	}

	public void printList() {
		DoubleEmployeeNode current = head;
		System.out.print("Head <-> ");
		while (current != null) {
			System.out.print(current);
			System.out.print("<->");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
	public void addBefore(Employee employee, Employee employee2) {
		DoubleEmployeeNode node = new DoubleEmployeeNode(employee);
		DoubleEmployeeNode node2 = new DoubleEmployeeNode(employee2);
		DoubleEmployeeNode current = head;
		while(current != null) {
			if(current.getEmployee().equals(node2.getEmployee())) {
				
				node.setPrevious(current.getPrevious());
				if(current.getPrevious() == null) {
					head = node;
				}else {
				current.getPrevious().setNext(node);
				}
				node.setNext(current);
				current.setPrevious(node);
			}
			current = current.getNext();
		}
	}

//	public void addBefore(Employee employee, Employee employee2) {
//	DoubleEmployeeNode node = new DoubleEmployeeNode(employee);
//	DoubleEmployeeNode node2 = new DoubleEmployeeNode(employee2);
//	DoubleEmployeeNode current = head;
//	while(current != null) {
//		System.out.println(current);
//		System.out.println(node2);
//		if(current.getEmployee().equals(node2.getEmployee())) {
//			System.out.println("true");
//			}
//		current = current.getNext();
//		}
//	}

	
	
	
	public void addToEnd(Employee employee) {
		DoubleEmployeeNode node = new DoubleEmployeeNode(employee);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}

		tail = node;
		size++;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public DoubleEmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		DoubleEmployeeNode removeNode = head;

		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}

	public DoubleEmployeeNode removeFromEnd() {

		if (isEmpty()) {
			return null;
		}

		DoubleEmployeeNode removeNode = tail;
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}

		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode;

	}

}
