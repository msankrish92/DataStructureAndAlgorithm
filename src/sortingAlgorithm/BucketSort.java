package sortingAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

	// first i need to store arrayList in a List of arrays
	public static void main(String[] args) {
		
		int[] input = {5,4,2,3,1};
		
		List<Integer>[] buckets = new List[10];

		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}

//		for (int i = 0; i < buckets.length-1; i++) {
//			System.out.println(buckets[i]);
//		}
		
		for(int i = 0; i<input.length; i++) {
			buckets[hash(input[i])].add(input[i]);
		}
		
		for(List bucket:buckets) {
			Collections.sort(bucket);
		}
		
		int j = 0;
		for (int i = 0; i < buckets.length; i++) {
			for(int value:buckets[i]) {
				input[j++] = value;
			}
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}
	
	public static int hash(int value) {
		return value/(int) 10;
	}

}
