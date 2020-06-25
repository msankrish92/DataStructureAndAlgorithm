package sortingAlgorithm;

public class Factorial {

	public static int recursiveFactorial(int input) {
		
		if(input == 0) {
			return 1;
		}
		
		return input * recursiveFactorial(input-1);
	}

	public static void main(String[] args) {
		int input = 1;
		int ouput = 1;
		for (int i = 0; i < input; i++) {
			ouput = ouput * (input - i);
		}
		System.out.println(ouput);
		System.out.println(recursiveFactorial(4));

	}

}
