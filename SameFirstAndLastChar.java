package assignments;

public class SameFirstAndLastChar {

	// Given a method with a string input. Write code to test if first and last
	// characters are same.
	// Incase they are same return 1 else return -1 as output. Note: consider case.
	// Example: input = "the picture was great" (first character = 't', last
	// character = 't') output = 1

	public static void main(String[] args) {

		String str = "the picture was great";
		String firstch = (Character.toString(str.charAt(0)));
		String lastch = (Character.toString(str.charAt(str.length() - 1)));
		int flag = -1;

		if (firstch.equalsIgnoreCase(firstch)) {
			flag = 1;
		}

		System.out.println("Output:" + flag);

	}

}
