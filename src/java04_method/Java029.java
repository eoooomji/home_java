package java04_method;

/* [출력결과]
 * 20은(는) 양수입니다.
 * 0은 0입니다.
 * -20은(는) 음수입니다.
 */
public class Java029 {

	public static void main(String[] args) {
		process(20);
		process(0);
		process(-20);

	} // end main()

	public static void process(int num) {
		if (num > 0) {
			System.out.printf("%d은(는) 양수입니다. \n", num);
		} else if (num == 0) {
			System.out.printf("%d은(는) 0입니다. \n", num);
		} else {
			System.out.printf("%d은(는) 음수입니다.", num);
		}
	}
} // end class
