package assignments;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		long binary = decimalToBinary(156);
		System.out.println("Binary number is ::" +binary);
	}

	public static long decimalToBinary(int num) {
		
		long binaryNum = 0;
		int remainder = 1;
		int i =1;
		
		while(num !=0) {
			
			remainder = num % 2;
			num = num / 2;
			binaryNum += remainder * i;
			i *=10;
		}
		
		return binaryNum;
		
		
	}
}
