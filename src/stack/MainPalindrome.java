package stack;

public class MainPalindrome {

	public static void main(String[] args) {
		StringStack<String> stack = new StringStack<String>();

		stack.push("I did,did I?");

		String pop = stack.pop();

		String replacePop = pop.replaceAll("[^a-zA-Z]", "");
		
		StringStack<Character> charStack = new StringStack<Character>();

		for (int i = 0; i < replacePop.length(); i++) {
			
			charStack.push(replacePop.charAt(i));
		}
		charStack.printStack();
		String a = new String();
		while (!charStack.isEmpty()) {

			a = a + charStack.pop();
		}

		System.out.println(a);

		if (replacePop.equalsIgnoreCase(a)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

}
