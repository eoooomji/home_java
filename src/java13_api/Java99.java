package java13_api;

import static java.lang.Math.*;

public class Java99 {

	public static void main(String[] args) {
		// 임의값 0.0 <= x < 1.0
		double ran = random();
		System.out.println(ran);

		// 임의값 0.0 <= x < 10.0
		ran = ran * 10;
		System.out.println(ran);

		// 소수점 이하는 버림(0.0 ~ 9.0을 리턴)
		// floor : 소수점 버리기
		// round : 반올림
		// ceil : 입력 인자 값보다 크거나 같은 가장 작은 정수 값을 double형으로 리턴
		int num = (int) floor(ran);
		System.out.println(num);

		// 1부터 10까지
		num = num + 1;
		System.out.println(num);

		// 한 문장으로 축약
		System.out.println((int) (floor(random() * 10)) + 1);

	} // end main()

} // end class
