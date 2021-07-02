package assignments;

/**
 * Ex:14 Concatenate the character in a given position. If there is no character
 * in a given position place "$" sign. input1[]={"abc","da","ram"}; input2=3;
 * hint : 3rd character is "c" in "abc" 3rd character is not present in "da", so
 * place "$" 3rd character is "m" in "ram" concate all the characters to a
 * single string "c$m" o/p string ="c$m";
 * 
 */

public class Concatenate {

	public static void main(String[] args) {
		
		String [] arr = {"abc","da","ram"};
		//char ch = ;
		String cStr = "";
		int strLen;
		for (int i = 0; i < arr.length; i++) {
				String curStr = arr[i];
				strLen = curStr.length();
				System.out.println("strLen::" +strLen);
				if(strLen == 2) {
					curStr = curStr +"$";
					
				}
				int curLen = curStr.length();
				for(int j=2; j<curLen;j++) {
						char ch = curStr.charAt(2);
						System.out.println("Current Char:" +ch);
						cStr = cStr + ch;
						System.out.println("CSTR ::" +cStr);
//						if((int)ch==0) {
//							cStr = cStr + "$";
//							System.out.println("CSTR With $ ::" +cStr);
//						}
				}
			
		}
		System.out.println("Concatinated String::" +cStr);
		
		
	}

}
