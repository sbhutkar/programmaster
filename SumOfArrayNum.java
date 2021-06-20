package assignments;

public class SumOfArrayNum {

	//Find the sum of the numbers in the given input string array Input:{“2AA”,”12”,”ABC”,”c1a”) 
	//Output:6 (2+1+2+1) Note in the above array 12 must not considered as such it must be considered as 1,2

	public static void main(String[] args) {

		String [] arrNum = new String [] {"2AA", "12", "ABC", "c1a"};
		int result =0 ;
		//Seprating num and alpha
		
		int arrNumSize = arrNum.length;
		String s = "";
		for (String e : arrNum) {
			
			s+=e;
			
		}
		char [] c = s.toCharArray();
		int cSize = c.length;
		for (int i = 0; i< cSize; i++) {
			
			char ele = c [i]; 
			int val = Character.getNumericValue(ele);
			//int ascii = ele;
			//System.out.println("ASCII" +ascii);
			if(val > 0 && val < 9) {
				//int result = Character.getNumericValue(ele);
				result = result+ val;
				System.out.println("Ouput is ::" + result);
			}
		}
		
	}

}
