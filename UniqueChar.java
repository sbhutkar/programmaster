package assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueChar {

	//Display unique characters in a string. input:"helloworld" output:"helowrd"
	
	public static void main(String[] args) {
		
		String str = "helloworld";
		//char [] ch = new char [10];
		HashSet<String> hs = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length();i++) {
			hs.add(Character.toString((str.charAt(i))));
		}
		
		 for (String s : hs)
	            System.out.print(s + "");
	  	}

}
