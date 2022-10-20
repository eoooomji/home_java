package java12_api;

/*
 * [출력결과]
 * java jsp spring
 */
public class Java86 {

	public static void main(String[] args) {
		String stn = new String("java_jsp_spring");
		System.out.println(process(stn.toCharArray()));
	}

	public static char[] process(char arr[]) {
		// '_'를 ' '으로 변환 후 리턴하는 프로그램을 구현하세요.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '_')
				arr[i] = ' ';
		}
		return arr;
	}
}
