package java04_method;

public class Java026 {

	public static void main(String[] args) {
		char data = 'd';
		char code = process(data);
		System.out.printf("%c의 대문자는 %c입니다. \n", data, code);
	} // end main()

	public static char process(char data) {
		/*
		 * 1. 대문자 A(65), 소문자 a(97)의 유니코드 
		 * 2. 대문자와 소문자 차이
		 * 3. int이하의 데이터 타입끼리 연산이 되면 결과는 int로 리턴
		 */
		
		return (char)(data-32);
	} // end process()
} // end class
