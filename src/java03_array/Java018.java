package java03_array;

public class Java018 {

	public static void main(String[] args) {
		char[][] alpa = new char[][] { { 'a', 'b', 'c', 'd' }, { 'a', 'b', 'c', 'd' }, { 'a', 'b', 'c', 'd' },
				{ 'a', 'b', 'c', 'd' } };
		for (int i = 0; i < alpa.length; i++) {
			for (int j = 0; j < alpa[i].length; j++) {
				if (i == j) {
					System.out.printf("%4c", '*');
				}
				System.out.printf("%4c", alpa[i][j]);
			}
			System.out.println();

			if (i == alpa.length - 1) {
				for (int k = 0; k < alpa[i].length; k++) {
					System.out.printf("%4c", alpa[i][k]);
				}
				System.out.printf("%4c", '*');
			}
		}

	} // end main()

} // end class
