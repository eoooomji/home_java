package java16_stream;

import java.util.Scanner;

public class Java124 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("x:");
		x = sc.nextInt();
		System.out.print("y:");
		y = sc.nextInt();
		System.out.printf("%d + %d = %d \n", x, y, x + y);
		sc.close();
	}

}
