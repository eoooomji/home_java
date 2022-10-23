package java13_api;

import static java.lang.Math.*;

import java.util.Arrays;

public class Java101 {

	public static void main(String[] args) {
		int[] num = new int[5]; // 1부터 10까지

		for (int i = 0; i < num.length; i++) {
			// 난수 발생
			num[i] = (int) floor(random() * 10) + 1;

			// 중복 체크
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}
			}
		}

		// 숫자 정렬
		Arrays.sort(num);
		for (int data : num)
			System.out.print(data + " ");

	} // end main()

} // end class
