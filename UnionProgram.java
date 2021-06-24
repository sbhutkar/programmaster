package assignments;

import java.util.HashSet;

public class UnionProgram {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4};
		int [] arr1 = {3,4,5,6};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
		}
		for(int j=0; j<arr1.length; j++) {
			hs.add(arr1[j]);
		}
		
		
			System.out.println("After Intersection Output is::" +hs);
		
	}

}
