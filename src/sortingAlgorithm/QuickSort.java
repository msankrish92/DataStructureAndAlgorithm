package sortingAlgorithm;

public class QuickSort {
	
	
	public static void quickSort(int[] arr, int start, int end) {
		
		if(end-start<2) {
			return;
		}
		
		int pivotValue = pivot(arr,start,end);
		quickSort(arr, start, pivotValue);
		quickSort(arr, pivotValue+1, end);
		
	}
	
	public static int pivot(int arr[],int start, int end) {
		int i = start;
		int j = end;
		int pivot = arr[start];
		while(i<j) {
			while(i<j && arr[--j]>=pivot);
			if(i<j) {
				arr[i] = arr[j];
			}
			while(i<j && arr[++i]<=pivot);
			if(i<j) {
				arr[j] = arr[i];
			}
		}
		arr[i] = pivot;
		return i;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {5,8,4,2,1};
		quickSort(arr, 0, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
