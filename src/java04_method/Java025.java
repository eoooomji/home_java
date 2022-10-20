package java04_method;

public class Java025 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.printf("a=%d, b=%d \n", a, b); // a=10, b=20
		callByValue(a, b); // c=20, d=10
		System.out.printf("a=%d, b=%d \n", a, b); // a=10, b=20 값이 변하지 않음.

		System.out.println();

		int[] num = new int[] { 10, 20 };
		System.out.printf("num[0]=%d, num[1]=%d \n", num[0], num[1]); // num[0]=10, num[1]=20
		callByReference(num); // arr[0]=20, arr[1]=10
		System.out.printf("num[0]=%d, num[1]=%d \n", num[0], num[1]); // num[0]=20, num[1]=10
	} // end main()

	public static void callByValue(int c, int d) {
		int temp = c;
		c = d;
		d = temp;
		System.out.printf("c=%d, d=%d \n", c, d);
	} // end callByValue()

	public static void callByReference(int[] arr) {
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		System.out.printf("arr[0]=%d, arr[1]=%d \n", arr[0], arr[1]);
	} // end callByReference()
} // end class
