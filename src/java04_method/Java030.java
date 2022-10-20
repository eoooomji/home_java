package java04_method;
/* [출력결과]
 * 입시총점 : 135점
 * 입시결과 : 불합격
 */
public class Java030 {

	public static void main(String[] args) {
		int toeic = 75;
		int it = 60;
		int sum = total(toeic, it);
		System.out.printf("입시총점 : %d점 \n", sum);
		System.out.printf("입시결과 : %s \n", rs(sum));
	} // end main()
	
	public static int total(int toeic, int it) {
		return toeic+it ;
	} // end total
	
	public static String rs (int total) {
		return total >= 800 ? "합격" : "불합격";
	}
} // end class
