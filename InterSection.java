package assignments;

import java.util.HashSet;
import java.util.Iterator;

public class InterSection {

	// Find (A union B) - (A intersection B)
	// Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6};
	// a union b = {1,2,3,4,5,6} a intersection b = {3,4}
	// (a union b) - (a intersection b) = {1,2,5,6}
	// Sample output: int[] c={1,2,5,6}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = { 3, 4, 5, 6 };
		int arrLen = arr.length;
		int arr1Len = arr1.length;
		int totalLen = arrLen + arr1Len;
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> hs1 = new HashSet<Integer>();
		int[] arr2 = new int[totalLen];
		
		int [] InterSec = new int[totalLen];
		int [] UnionVal = new int[totalLen];
		// Find Union
		// HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		for (int j = 0; j < arr1.length; j++) {
			hs.add(arr1[j]);
		}

		System.out.println("After Union Output is::" + hs);
		
		// Find Intersection
		// HashSet<Integer> hs1 = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {

				if (arr[i] == arr1[j]) {
					hs1.add(arr[i]);
					// intersection[i]= arr[i];
				}

			}

		}
		System.out.println("After Intersection Output is::" + hs1);

		for (Integer e : hs) {
		
			for(int m=0;m<totalLen;m++) {
				UnionVal[m] = e;
			}
		}
		for (Integer e : hs1) {
		
			for(int n=0;n<totalLen;n++) {
				InterSec[n] = e;
			}
		}
		
		
		for (int k = 0; k < totalLen; k++) {
			if (UnionVal[k] == InterSec[k]) {
				arr2[k] = UnionVal[k];
			}
		}
		
		for (int e : arr2) {
			System.out.println(e);
		}
	}

}
