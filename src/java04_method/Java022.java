package java04_method;

public class Java022 {

	public static void main(String[] args) {
		int year = 2013;
		boolean result = isLeapYear(year);
		if (result) {
			System.out.printf("%d는 윤년입니다.", year);
		} else {
			System.out.printf("%d는 평년입니다.", year);
		}
	} // end main()

	public static boolean isLeapYear(int year) {
		 // boolean chk;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
			// chk = true;
		} else {
			return false;
			// chk = false;
		}
	} // end isLeapYear()

} // end class
