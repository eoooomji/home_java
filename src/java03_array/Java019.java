package java03_array;

public class Java019 {

	public static void main(String[] args) {

		int[][] num1 = new int[3][];

		num1[0] = new int[2]; // 0행 2열
		num1[1] = new int[3]; // 1행 3열
		num1[2] = new int[5]; // 2행 5열

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				System.out.printf("%4d", num1[i][j]);
			}
			System.out.println();
		}

		System.out.println("======================");

		int[][] num = new int[][] { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%4d", num[i][j]);
			}
			System.out.println();
		}

		System.out.println("======================");

		char[][] color = new char[3][];
		color[0] = new char[] { 'r', 'e', 'd' };
		color[1] = new char[] { 'g', 'r', 'e', 'e', 'n' };
		color[2] = new char[] { 'p', 'i', 'n', 'k' };

		for (int i = 0; i < color.length; i++) {
			for (int j = 0; j < color[i].length; j++) {
				System.out.printf("%3c", color[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<color.length ;i++) {
			System.out.println(color[i]);
		}

	} // end main()

} // end class
