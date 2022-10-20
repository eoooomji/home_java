package java03_array;

public class Java015 {

	public static void main(String[] args) {
		String[] name = { "홍길동", "이영희" };
		int[][] jumsu = { { 90, 85, 40 }, { 100, 35, 75 } };

		int hap;

		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s", name[i]);
			hap = 0;
			for (int j = 0; j < jumsu[i].length; j++) {
				System.out.printf("%4d", jumsu[i][j]);
				hap += jumsu[i][j];
			}
			System.out.printf("%4d %5.1f \n", hap, hap / 3.0);
		}
	
	} // end main()

} // end class
