package java15_exception;

public class Java117 {

	public static void main(String[] args) {
		String data1 = "a";
		String data2 = "0";

//		int x = Integer.parseInt(data1);
//		int y = Integer.parseInt(data2);
//		int res = x / y;
//		System.out.println(res);
		// Exception in thread "main" java.lang.NumberFormatException: For input string:
		// "a"

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x / y;
			System.out.println(res);
		} catch (ArithmeticException ex) { // 문자가 아니라고 뜰 때
			System.out.println(ex.toString());
		} catch (NumberFormatException ex) { // 숫자가 아니라고 뜰 때
			System.out.println(ex.toString());
		} catch (RuntimeException ex) { // 위의 exception의 상위 클래스. 모든 예외상황일 때
			System.out.println(ex.toString());
		}

	} // end main()

} // end class
