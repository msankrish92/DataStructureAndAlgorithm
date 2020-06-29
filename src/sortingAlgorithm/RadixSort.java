package sortingAlgorithm;

public class RadixSort {

	public static void main(String[] args) {

		int arr[] = { 4581, 5521, 4478, 2251, 5564 };
		radix(arr, 10, 4);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void radix(int arr[], int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSort(arr, i, radix);
		}
	}

	public static void radixSort(int arr[], int position, int radix) {

		int[] countArrary = new int[radix];

		for (int i = 0; i < arr.length; i++) {
			countArrary[getDigit(arr[i], position, radix)]++;
		}

		for (int i = 1; i < countArrary.length; i++) {
			countArrary[i] = countArrary[i] + countArrary[i - 1];
		}

		int temp[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			temp[--countArrary[(getDigit(arr[i], position, radix))]] = arr[i];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}

	}

	public static int getDigit(int value, int position, int radix) {
		return value / (int) Math.pow(10, position) % radix;
	}

}
