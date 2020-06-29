package sortingAlgorithm;

public class CountingSort {

	public static void countingSort(int arr[], int min, int max) {
		int countArray[] = new int[(max-min)+1];
		
		for(int i = 0; i<arr.length; i++) {
			countArray[arr[i]-1]++;
		}
		
		for (int i = 0; i < countArray.length; i++) {
			System.out.println(countArray[i]);
		}
		
		int j = 0;
		for(int i = 0; i<arr.length; i++) {
			while(countArray[i]>0) {
				arr[j++] = i+1;
				countArray[i]--;
			}
		}
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {

		int arr[] = { 5, 3, 2, 5, 4 };
		
		countingSort(arr, 1, 5);

		
	}
	

}
