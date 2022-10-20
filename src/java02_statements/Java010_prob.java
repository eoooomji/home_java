package java02_statements;

public class Java010_prob {

	public static void main(String[] args) {
		int num = 12;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

		System.out.println("===================");

		for (int year = 2001; year <= 2012; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year);
			}
		}

		System.out.println("===================");

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);

		System.out.println("===================");

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (10 == 2 * x + 3 * y) {
					System.out.printf("x=%d, y=%d \n", x, y);
				}
			}
		}

		System.out.println("===================");

		for (int i = 2; i <= 5; i++) {
			System.out.printf("%d의 배수 : ", i );
			for (int j = 1; j <= 20; j++) {
				if(j % i == 0) {
					System.out.printf("%3d",j);
				}
			}System.out.println();
		}

	} // end main()

} // end class
