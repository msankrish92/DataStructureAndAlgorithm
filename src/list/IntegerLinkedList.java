package list;

public class IntegerLinkedList {

	IntegerSingLinkListNode head;
	public int size;

	public void addToFront(IntegerSingLinkListNode input) {
//		IntegerSingLinkListNode node = new IntegerSingLinkListNode();
		input.setNext(head);
		head = input;
		size++;
	}

	public void add(IntegerSingLinkListNode input) {
//		IntegerSingLinkListNode current = head;
//		IntegerSingLinkListNode beforeCurrent = head;
//		while (current != null) {
//			System.out.println(input);
//			System.out.println(current);
//			if (input.getInput() > current.getInput()) {
//				
//				current.setNext(input);
////				
////				input.setNext(current.getNext());
////				beforeCurrent.setNext(input);
//
//			} else if (input.getInput() < current.getInput()) {
//				input.setNext(current);
//
//			}
//			beforeCurrent = current;
//			current = current.getNext();
//
//		}
//
//		if (head == null) {
//			input.setNext(head);
//			head = input;
//		}

		if (head == null || head.getInput() >= input.getInput()) {
			addToFront(input);
			return;
		}

		IntegerSingLinkListNode current = head.getNext();
		IntegerSingLinkListNode previous = head;
		while (current != null && current.getInput() < input.getInput()) {
			previous = current;
			current = current.getNext();
		}

		input.setNext(current);
		previous.setNext(input);

		size++;

	}

	public void printInput() {
		IntegerSingLinkListNode current = head;
		while (current != null) {
			System.out.println(current.getInput());
			current = current.getNext();
		}
	}

	public int size() {
		return size;
	}

	public void printlist() {
		IntegerSingLinkListNode current = head;
		while (current != null) {
			System.out.println(current);
			current = current.getNext();
		}

	}

}
