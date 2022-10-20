package java03_array;

public class Java011 {

	public static void main(String[] args) {
		int ko = 90;
		int en = 80;
		int jp = 40;

		int arr[];

		arr = new int[3]; // 배열 생성

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 40;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("========================");

		int[] data = { 10, 20, 30 };
		int[] jumsu = new int[] { 90, 80, 40 };

		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d] = %d \n", i, data[i]);
		}

		System.out.println("========================");

		for (int i = jumsu.length - 1; i >= 0; i--) {
			System.out.printf("jumsu[%d] = %d \n", i, jumsu[i]);
		}

		System.out.println("========================");

		int[] num = new int[] { 22, 3, 8, 12 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("합계 : " + sum);
		
	} // end main()

} // end class
