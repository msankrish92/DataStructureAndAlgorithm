package sortingAlgorithm;

public class BubbleSort {

	
	public static void main(String[] args) {
		
		int[] intArray = {55,-1,54,75,8,4,6};
		
		for (int i = intArray.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(intArray[j]>intArray[j+1]) {
					int temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;
				}
			}
		}
		
		for(int a : intArray) {
			System.out.println(a);
		}
		
		
	}
	
}
