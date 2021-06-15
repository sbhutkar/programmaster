package assignments;

//Convert String array to String String[] input1=["Vikas","Lokesh",Ashok] Expected output String: "Vikas,Lokesh,Ashok"

public class ConvertStringArrayToString {

	public static void main(String[] args) {

		String [] arrStr =  new String[] {"Vikas", "Lokesh", "Ashok"};
		String str=""; 
		for(int i=0 ; i < arrStr.length; i++) {
			
			str = str + arrStr[i].toString() + "," ;
		}
		System.out.print("Element of Array are :: " + str );
		
	}

}
