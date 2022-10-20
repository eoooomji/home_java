package java07_class.part02;

/*
 * [출력결과]
 * 10 + 3 = 13
 * 3 * 2 = 6
 */
public class Java42 {

	public static void main(String[] args) {
		int[] left = { 10, 3 };
		int[] right = { 3, 2 };
		char[] ope = { '+', '*' };

		Calc[] nfo = new Calc[2];
		for (int i = 0; i < nfo.length; i++) {
			if (checkOperator(ope[i])) {
				return;
			}
			nfo[i] = new Calc(left[i], right[i], ope[i]);
		}
		prn(nfo);
	}// end main()

	public static void prn(Calc[] nfo) {
		for (int i = 0; i < nfo.length; i++) {
			System.out.println(nfo[i].toString());
		}
	}

	public static boolean checkOperator(char ope) {
		if (!(ope == '+' || ope == '-' || ope == '*' || ope == '/')) {
			System.out.println("+, -, *, / 연산자만 가능합니다.");
			return true;
		}
		return false;
	}
}
