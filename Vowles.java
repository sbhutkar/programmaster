package assignments;

public class Vowles {

	public static void main(String[] args) {

		String str = "NewyorkE";
		// str = str.toLowerCase();
		int length = str.length();
		int vowelCount = 0;
		int aCnt;
		int eCnt=0;
		int iCnt;
		int oCnt;
		int uCnt;
		
		
		for (int i = 0; i < length; i++) {

			char ch = str.charAt(i);
			
			
			if(ch == 'e' || ch == 'E') {
				 eCnt++;
				if(eCnt>0) {
					vowelCount++;
				}
			}
		
		
		
		}
		
		System.out.println("E count" +eCnt);
		System.out.println("vowelCount ::" +vowelCount );

}		
	
}