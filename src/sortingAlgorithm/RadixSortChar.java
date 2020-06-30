package sortingAlgorithm;

public class RadixSortChar {

	public static void radixSort(String arr[], int radix, int width) {
		
		int[] countArr = new int[radix];
		
		for (int i = 0; i < arr.length; i++) {
			countArr[getChar(arr[i], width)]++;
		}
		
//		for (int i = 0; i < countArr.length; i++) {
//			System.out.print(countArr[i] + ",");
//		}
//		System.out.println();
//	
		for(int i = 1; i<countArr.length; i++) {
			countArr[i] = countArr[i] + countArr[i-1];
		}
		
//		for (int i = 0; i < countArr.length; i++) {
//		System.out.print(countArr[i] + ",");
//		}
//		System.out.println();
		
		String temp[] = new String[arr.length];
//		int tempIndex = 0;
		
		for (int i = arr.length; i > 0; i--) {
			temp[--countArr[getChar(arr[i-1], width)]] = arr[i-1];
		}
	
		System.arraycopy(temp, 0, arr, 0, arr.length);
		
//		for (int i = 0; i < temp.length; i++) {
//			System.out.println(temp[i]);
//		}
	
	
	}
	
	public static char getChar(String Value, int position) {
		return Value.charAt(Value.length()-1-position);
	}

	public static int getDigit(int value, int position, int radix) {
		return value / (int) Math.pow(10, position) % radix;
	}

	public static void main(String[] args) {
		String[] arr = {"bcdef","dbaqc","abcde","omadd","bbbbb"};
//		int arr[] = { 5555, 4444, 1111, 2222, 3333 };

		for (int i = 0; i < 5; i++) {
			radixSort(arr, 123, i);
		}
//		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//	System.out.println(getChar("bcsaw", 1));
	
	}

}
