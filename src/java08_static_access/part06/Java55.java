package java08_static_access.part06;

import java08_static_access.part05.Java53;

// import : 다른 곳의 패키지를 가져올 때 사용. 클래스 위치를 잡아줘야 한다.

public class Java55 extends Java53 {
	public static void main(String[] args) {
		// Java53 p = new Java53();
		Java55 p = new Java55();
		// System.out.printf("var_private=%d \n", p.var_private);
		// System.out.printf("var_default=%d \n", p.var_default);
		System.out.printf("var_protected=%d \n", p.var_protected);
		System.out.printf("var_public=%d \n", p.var_public);

	}
}
