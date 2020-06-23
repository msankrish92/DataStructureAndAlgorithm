package sortingAlgorithm;

public class SelectionSort {

	public static void main(String[] args) {

		int[] intArray = { 55, -1, 54, 75, 8, 4, 6 };
		
		for (int i = intArray.length-1; i >0 ; i--) {
			int largest = 0;
			for (int j = 1; j < i; j++) {
				if(intArray[j]>intArray[largest]) {
					largest = j;
				}	
			}
			int temp = intArray[largest];
			intArray[largest] = intArray[i];
			intArray[i] = temp;
			
		}
	
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	
	
	}
}
