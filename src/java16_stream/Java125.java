package java16_stream;

import java.util.Scanner;

/*
 * [순번 이름 평균] 입력
 * 순번: 10
 * 이름: 홍길동
 * 평균: 9.5
 */

public class Java125 {

	public static void main(String[] args) {
		System.out.print("[순번 이름 평균] 입력:");
		Scanner sc = new Scanner(System.in);
		int num;
		String name;
		double avg;
		num = sc.nextInt();
		name = sc.next();
		avg = sc.nextDouble();
		System.out.printf("순번:%d\n", num);
		System.out.printf("이름:%s\n", name);
		System.out.printf("평균:%.1f\n", avg);

	} // end main()

} // end class
