package assignments;

public class LeapYear {

//Calculate whether given year as leap or not; Sample input: int year = 2020; Sample output: boolean isLeapYear = true;
	
	public static void main(String[] args) {

		int year = 2012;
		boolean flag = false;
		
		
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if (year % 400 == 0) {
					flag = true;
					
				}else {
					flag = false;
				}
				
			}else {
				flag = true;
			}
			
		}else {
			flag = false;
		}
		
		if(flag) {
			System.out.println(year + " is a Leap Year ");
		}else {
			System.out.println(year + " is not a Leap Year ");
		}
	}

}
