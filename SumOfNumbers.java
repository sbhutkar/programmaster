package assignments;

public class SumOfNumbers {

	//EX.5
	//Sum of Numbers in array
	//Find the sum of the numbers in the given input string array 
	//Input:{“2AA”,”12”,”ABC”,”c1a”} 
	//Output:6 (2+1+2+1) Note in the above array 12 must not considered as such it must be considered as 1,2
	
	public static void main(String[] args) {
		
		String arr [] = {"2AA","12", "ABC", "c1a"};
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			
			String str = arr[i];
			
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (ch >= 48 && ch <= 57) {
					int CharVal = Character.getNumericValue(ch);
					 sum = sum + CharVal;
				}
			}
				
			
			
		}
		//int totalSum = sum;
		System.out.println("Sum of numbers" +sum);
		
	}

}
