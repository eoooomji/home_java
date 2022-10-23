package java15_exception;

public class Java {

	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "1a";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			process(x, y);
		} catch (NumberFormatException ex) {
			System.out.println(ex.toString());
		} catch (ArithmeticException ex) {
			System.out.println(ex.toString());
		}

	} // end main()

	public static void process(int x, int y) throws ArithmeticException {
		int res = x / y;
		System.out.println(res);
		// Exception in thread "main" java.lang.ArithmeticException
		// exception발생. throws로 exception처리
	}

} // end class
