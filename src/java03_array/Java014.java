package java03_array;

public class Java014 {

	public static void main(String[] args) {
		int[][] num = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}

		System.out.println("========================");

		for (int col = 0; col < 2; col++) {
			for (int row = 0; row < num.length; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}

		System.out.println("========================");

		for (int col = 0; col < 2; col++) {
			for (int row = 0; row < 3; row++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}
	} // end main()

} // end class
