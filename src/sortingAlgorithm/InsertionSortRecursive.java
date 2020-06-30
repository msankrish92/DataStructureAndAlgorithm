package sortingAlgorithm;

public class InsertionSortRecursive {

	public static void insertionSort(int arr[], int start, int end) {
		for(int i = 1; i<arr.length; i++) {
			int newEle = arr[i];
			int j;
			for(j = i; j>0&&arr[j-1]>newEle; j--) {
				arr[j] = arr[j-1];
 			}
			arr[j] = newEle;
		}
	}
	
	public static void recursiveInsertionSort(int arr[], int start, int end) {
		
		int i = end - 1;
		if(i<2) {
			return;
		}
		recursiveInsertionSort(arr, start, i);
		System.out.println(start + " " + i);
		int newEle = arr[i];
		int j;
		for(j = i; j>0&&arr[j-1]>newEle; j--) {
			arr[j] = arr[j-1];
		}
		arr[j] = newEle;
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {5,4,1,2,3};
		recursiveInsertionSort(arr, 0, 5);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	
}
