package list;

public class IntegerListMain {
	
	public static void main(String[] args) {
		
		IntegerLinkedList list = new IntegerLinkedList();
		
		list.add(new IntegerSingLinkListNode(10));
		list.add(new IntegerSingLinkListNode(20));
		list.add(new IntegerSingLinkListNode(30));
		list.add(new IntegerSingLinkListNode(40));
		
		list.printlist();
//		System.out.println(list.size());
		
//		list.printInput();
	}

}