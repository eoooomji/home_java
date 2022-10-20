package java08_static_access.part03;

public class Java51 {
	int x = 3;
	static int y = 5;

	public static void main(String[] args) {
		// System.out.printf("x=%d \n", x); // non-static
		System.out.printf("y=%d \n", y);
		// process(); // non-static
		Java51 js = new Java51();
		js.process();

		display(); // static

	} // end main()

	public void process() {
		System.out.println("process");
		display(); // non-static 메서드에서 static 메서드 호출 가능
	} // end process()

	public static void display() {
		System.out.println("display");
	}// end display()
} // end class
