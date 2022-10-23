package java13_api;

/*
 * sn변수에 저장된 문자열 중에서 숫자갯수를 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 숫자갯수:3
 */
public class Java107 {

	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;

		char[] line = sn.toCharArray(); // sn문자열을 char배열로 바꾸기
		for (char data : line) // line문자 배열을 data문자로 바꾼뒤 반복문 작성
			if (Character.isDigit(data)) // data에 숫자가 있는지 논리값 작성
				cnt++; // 숫자면 cnt 증감
		System.out.println("숫자갯수:" + cnt);
	} // end main()

} // end class
