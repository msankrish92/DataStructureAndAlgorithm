package queue;

public class Palindrome {
	
	
	
	
	public static void main(String[] args) {
		String input = "I did,did I?";
		
		String replacePop = input.replaceAll("[^a-zA-Z]", "");
		
		StackQueue<Character> stackQueue = new StackQueue<Character>();
		
		for(int i = 0; i<replacePop.length(); i++) {
			stackQueue.push(replacePop.charAt(i));
		}
		
		StringBuilder reverse = new StringBuilder();
		
		for(int i = 0; i<replacePop.length(); i++) {
			reverse.append(stackQueue.remove());
		}
		
		String string = reverse.toString();
		String output = replacePop.equalsIgnoreCase(string)?  "is palindrome": "not a palindrome";
		System.out.println(output);
	}
	

}
