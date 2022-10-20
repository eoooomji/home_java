package java13_api;

import java.util.StringTokenizer;

public class Java96 {

	public static void main(String[] args) {
		// StringTokenizer("문자열", "구분자")
		// 문자열을 선택한 구분자로 쪼개는 클래스. 쪼개어진 문자열을 토큰이라고 부른다.

		// StringTokenizer st = new String("java,jsp",",");

		StringTokenizer st = new StringTokenizer("java jsp");
		// System.out.println(st.countTokens()); // 2
		// System.out.println(st.nextToken()); // java
		// System.out.println(st.countTokens()); // 1
		// System.out.println(st.nextToken()); // jsp
		// System.out.println(st.countTokens()); // 0
		// System.out.println(st.nextToken());
		// Exception in thread "main" java.util.NoSuchElementException

		// for(int i = 0; i<st.countTokens(); i++) {
		// System.out.println(st.nextToken()); // java
		// }

		// int count = st.countTokens();
		// for(int i = 0 ; i < count; i ++) {
		// System.out.println(st.nextToken()); // java jsp
		// }

		// hasMoreTokens() : StringTokenizer에 사용할 수 있는 토큰이 있는지 확인한다.
		// 메모리에 저장된 토큰이 있으면 true, 없으면 false를 리턴한다.
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	} // end main()

} // end class
