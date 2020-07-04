package searchAlgorithm;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

//		System.out.println(iterativeBinarySearch(arr, 5));
//		System.out.println(iterativeBinarySearch(arr, 1));
//		System.out.println(iterativeBinarySearch(arr, 6));
//		
		System.out.println(recursiveBinarySearch(arr, 5));
		System.out.println(recursiveBinarySearch(arr, 1));
		System.out.println(recursiveBinarySearch(arr, 6));
	}

	public static int iterativeBinarySearch(int arr[], int value) {

		int start = 0;
		int end = arr.length;

		while (start < end) {
			int midPoint = (start + end) / 2;
			if (arr[midPoint] == value) {
				return midPoint;
			} else if (arr[midPoint] < value) {
				start = midPoint + 1;
			} else {
				end = midPoint;
			}

		}
		return -1;

	}

	public static int recursiveBinarySearch(int arr[], int value) {
		return recursiveBinarySearch(arr, 0, arr.length, value);
	}

	public static int recursiveBinarySearch(int arr[], int start, int end, int value) {
		if (start >= end) {
			return -1;
		}
		int mid = (start + end) / 2;

		if (arr[mid] == value) {
			return mid;
		} else if (arr[mid] < value) {
			return recursiveBinarySearch(arr, mid + 1, end, value);
		} else {
			return recursiveBinarySearch(arr, start, mid, value);
		}

	}

}
