package assignments;

import java.util.HashSet;

public class IntersectionPro {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4};
		int [] arr1 = {3,4,5,6};
		//int [] intersection = new int[4];
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				
				if(arr[i] == arr1[j]) {
					hs.add(arr[i]);
					//intersection[i]= arr[i];
				}
				
			}
			
		}
		System.out.print("Intersection output ::" +hs);
//		for (int e : intersection) {
//			System.out.print("Intersection output ::" +e);
//		}
//		
	}

}
