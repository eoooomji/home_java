package java13_api;

import java.util.StringTokenizer;

public class Java97 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("javam,/jsp/spring", ",/");
		// ",/" : '쉼표(,)나 슬래시(/)이면' 이라는 뜻
		System.out.println(st.countTokens()); // 3
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("====================");

		// spilt에는 정규화 표현식 사용이 가능하다.
		String[] data = new String("java,/jsp/spring").split("[,/]");
		System.out.println(data.length);
		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d]=%s\n", i, data[i]);
		}
		// data[0]=java
		// data[1]=
		// data[2]=jsp
		// data[3]=spring

	} // end main()

} // end class
