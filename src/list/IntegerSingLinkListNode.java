package list;

public class IntegerSingLinkListNode {

	private int input;
	private IntegerSingLinkListNode next;

	public IntegerSingLinkListNode(int input) {

		this.input = input;
	}

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public IntegerSingLinkListNode getNext() {
		return next;
	}

	public void setNext(IntegerSingLinkListNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return input + "";
	}
	
	

}
