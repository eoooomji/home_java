package java15_exception;

public class Java115 {

	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);

		process(num);

		try {
			display(num);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString()); // 0
		}
	} // end main()

	public static void display(int[] num) throws ArrayIndexOutOfBoundsException {
		System.out.println(num[2]);
		
	} // end display()

	public static void process(int[] num) {
		// System.out.println(num[4]);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		// exception발생이 되어 예외 구문 작성한다.

		try {
			// 예외 발생 가능 구문
			System.out.println(num[4]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			// Index 4 out of bounds for length 3
			System.out.println(ex.toString());
			// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
			ex.printStackTrace();
			// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
			// at java15_exception.Java115.process(Java115.java:26)
			// at java15_exception.Java115.main(Java115.java:10)
		} finally {
			System.out.println("program end");
		}

	} // end process()

} // end class
