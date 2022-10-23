package java14_api;

public class Java109 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 2, 4 };
		int[] arr2 = { 6, 3, 9, 7, 8 };
		int[] arr3 = { 4, 2 };
		int[] arr4 = process(arr1, arr2, arr3);
		for (int data : arr4)
			System.out.printf("%3d", data);

	} // end main()

	public static int[] process(int[] arr1, int[] arr2, int[] arr3) {
		int[] arr4 = new int[arr1.length + arr2.length + arr3.length];

		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.arraycopy(arr2, 0, arr4, arr1.length, arr2.length);
		System.arraycopy(arr3, 0, arr4, arr1.length + arr2.length, arr3.length);

		return arr4;
	}

} // end class
