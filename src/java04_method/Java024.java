package java04_method;

public class Java024 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = a, d = b; // 값에 의한 복사(call by value)
		// a = 10 , b = 20, c = 10, d= 20

		// c, d 변수의 값을 교환
		int temp = c; // temp에 c값을 저장
		c = d; // c에 d값을 저장
		d = temp; // d에 temp값을 저장
		// temp = 10, c = 20, d = 10

		System.out.printf("a=%d, b=%d \n", a, b); // a=10, b=20
		System.out.printf("c=%d, d=%d \n", c, d); // c=20, d=10
		// 값에 의한 복사는 기존의 값이 변하지 않는다.

		System.out.println("===================");

		int[] num = new int[] { 10, 20 };
		int[] arr = num;
		; // 주소에 의한 복사(call by reference)
			// num={ 10, 20 }, arr = { 10, 20 }
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;

		System.out.printf("num[0]=%d, num[1]=%d \n", num[0], num[1]); // num[0]=20, num[1]=10
		System.out.printf("arr[0]=%d, arr[1]=%d", arr[0], arr[1]); // arr[0]=20, arr[1]=10
		// arr값을 교환하였더니 num값도 같이 바뀌었다.(주소에 의한 복사)

	} // end main()

} // end class
