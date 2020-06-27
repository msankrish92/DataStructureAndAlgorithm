package sortingAlgorithm;

public class MergeSort {
	
	
	public static void merge(int arr[], int start, int end) {
		if(end-start<2) {
			return;
		}
		
		int mid = (start + end) / 2;
		merge(arr,start,mid);
		merge(arr,mid,end);
		mergeSort(arr,start,mid,end);
		
	}
	
	public static void mergeSort(int arr[], int start, int mid, int end) {
		if(arr[mid-1]<arr[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] tempArr = new int[end-start];
		while(i<mid && j <end) {
			tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
		}
		
		System.arraycopy(arr, i, arr, start+tempIndex, mid-start);
		System.arraycopy(tempArr, 0, arr, start, tempIndex);
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {5,8,4,2,1};
		merge(arr, 0, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
