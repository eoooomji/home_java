package java13_api;

/*
 * java.lang.String : immutable(불변)
 * java.lang.StringBuffer : mutable(가변), 동기화
 * java.lang.StringBuilder : mutable(가변), 비동기화
 * 
 * StringBuffer 특징
 * 1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
 * 2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.
 * 
 */
public class Java93 {

	public static void main(String[] args) {
		String sg = new String("java test java");
		String ss = sg.replace("java", "jsp");
		// String은 불변이라 값이 변하지 않는다.
		// replace : 새로운 임시 메모리 생성 및 기존데이터 복사(StringBuffer)가 이루어 진다.
		// 새로운 String을 생성 후 StrignBuffer가 복사 및 값이 넘어간다. 그리고 ss변수에 메모리를 할당한다.
		System.out.println("ss:" + ss); // ss:jsp test jsp
		System.out.println("sg:" + sg); // sg:java test java
		System.out.println(ss == sg); // false (메모리의 값이 다르기 때문)
		// 리턴 타입 : String
		System.out.println(sg.toString()); // java test java

		StringBuffer sb = new StringBuffer("spring test");
		StringBuffer su = sb.replace(0, 6, "framework");
		System.out.println("sb:" + sb); // sb:framework test
		System.out.println("su:" + su); // sb:framework test
		System.out.println(sb == su); // true
		// 리턴 타입 : StringBuffer
		System.out.println(sb.equals(su)); // true
		System.out.println(sb.toString()); // framework test

	} // end main()

} // end class
