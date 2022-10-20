package java04_method;

/*
 * [출력결과]
 * 10일때 => 10은(는) 짝수입니다.
 * 9일떄 => 9는(은) 홀수입니다.
 */
public class Java027 {

	public static void main(String[] args) {
		int data = 5;
		System.out.printf("%d은 %s입니다.", data, process(data) ? "짝수" : "홀수");
		System.out.println();
		String result = process(data) ? "짝수" : "홀수";
		System.out.printf("%d은(는) %s입니다.", data, result);
	} // end main()

	public static boolean process(int data) {
		return data % 2 == 0 ? true : false;

		// if (data % 2 == 0 )
		// return true;
		// else
		// return false;
	}
} // end class
