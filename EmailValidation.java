package assignments;

//Email Validation. Output is false if the validation fails else true. 
// String input1="test@gmail.com" 

// 1)@ & : should be present; 
// 2)@ & . should not be repeated; 
// 3)there should be four charcters between @ and .; 
// 4)there should be atleast 3 characters before @ ;
// 5)the end of mail id should be .com; 
//  Expected Output=true

public class EmailValidation {

	public static void main(String[] args) {

		String str = "test@gmail.com";
		int atCnt = 0;
		int dotCnt = 0;

		if (str.contains("@")) {
			atCnt = atCnt + 1;
			// System.out.println("atCnt::" +atCnt);
		}
		if (str.contains(".")) {
			dotCnt = dotCnt + 1;
			// System.out.println("dotCnt::" +dotCnt);
		}
		String intialString = str.substring(4, 8);
		// System.out.println("Length ::" +intialString.length());

		String lastString = str.substring(10, str.length());
		// System.out.println("Last String::" +lastString);

		boolean flag = false;

		if (atCnt > 0 && atCnt < 2) {
			if (dotCnt > 0 && dotCnt < 2) {
				if (intialString.length() >= 3) {
					if (lastString.equalsIgnoreCase(".com")) {
						flag = true;
					} else {
						System.out.println("Last string is not .com");
					}
				} else {
					System.out.println("@ count is greated than 1");
				}
			} else {
				System.out.println(". count is greated than 1");
			}
		} else {
			System.out.println("@ count is greated than 1");
		}

		System.out.println("Validaiton Output::" + flag);

	}
}