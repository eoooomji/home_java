package java15_exception;

public class Java120 {

	public static void main(String[] args) {
		int data = 5;
		try {
			if (data < 10)
				throw new UserException("10이상만 입력하세요.");
			System.out.println(data);
		} catch (UserException ex) {
			System.out.println(ex.toString());
		}

	} // end main()

} // end class
