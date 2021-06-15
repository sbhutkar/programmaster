package assignments;

import java.util.Arrays;

public class MaxandMinNumber {

	public static void main(String[] args) {

		int arr [] = new int [3];		
		arr[0] = 4;
		arr[1] = 3;
		arr[2] = 8;
		int max;
		int min;
		
		if (arr[0] > arr[1] && arr[0] > arr[2]) {
			max = arr[0];
		}else if (arr[1] > arr[2]) {
			max = arr[1];
		}else {
			max = arr[2];
		}
		System.out.println("Maximum number from array is ::" +max);
		
		if (arr[0] < arr[1] && arr[0] < arr[2]) {
			min = arr[0];
		}else if (arr[1] < arr[2]) {
			min = arr[1];
		}else {
			min = arr[2];
		}
		
		System.out.println("Minimum number from array is ::" +min);
		
		int sum = max + min;
		System.out.println("Sum of Max and Min number is ::" +sum);
				
		
		
	}

}
