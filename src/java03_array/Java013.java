package java03_array;

public class Java013 {

	public static void main(String[] args) {
		int[][] num = new int[3][2];

		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i][0]);
			System.out.printf("%4d \n", num[i][1]);
		}

		System.out.println("========================");

		for(int row = 0; row< num.length; row++) {
			for(int col = 0; col < num[row].length; col++ ) {
				System.out.printf("%4d",num[row][col]);
			}System.out.println();
		}
		
		System.out.println("========================");
		
		
	} // end main()

} // end class
