package assignments;

import java.util.Scanner;

//Ex.4
//Find the number of words are of given length 
//Input1:{“aa”,”b”,”cc”,”ddd”} Input2:2 Output1:2
//Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1
//Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1



public class NoOfElements {

	public static void main(String[] args) {
		
		String arr [] = {"aa","b", "cc", "dddd"};
	
		System.out.println("Enter the Input");
		Scanner scan = new Scanner (System.in);
		
		int input = scan.nextInt();
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			if (input == arr[i].length()) {
				count++;
			}
		}
		System.out.println("Count of a elements in array for given Input ::" +count );
	}

}
