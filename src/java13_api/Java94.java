package java13_api;

public class Java94 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		// 4인덱스에 ,jsp 문자열을 삽입
		sb.insert(4, ", jsp");
		System.out.println(sb); // java, jsp test
		
		// 4인덱스부터 9인덱스 미만 사이의 문자열 삭제
		sb.delete(4, 9);
		System.out.println(sb); // java test
		
		// 마지막에 문자열을 추가
		sb.append(" start");
		System.out.println(sb); // java test start
		
		// 문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb); // trats tset avaj
		
		// String -> StringBuffer -> String 하는 작업 순서
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf); // mro sitabym
		System.out.println(data); // mybatis orm
		String re = sf.toString(); // StringBuffer를 String값으로 바꿔줘야 한다.
		System.out.println(re); // 데이터 String type
		
		// char[] -> String -> StringBuffer
		char[] arr = {'k','o','r','e','a'};
		String sp = String.valueOf(arr);
		StringBuffer se = new StringBuffer(sp);
		// StringBuffer sr = new StringBuffer();
		// sr.append(sp);
		se.reverse();
		System.out.println(se); // aerok
		// 한 문장으로 축약
		System.out.println(new StringBuffer(String.valueOf(arr)).reverse()); // aerok
		
		// StringBuffer -> String -> char[]
		String st = se.toString();
		char[] val = st.toCharArray();
		System.out.println(val);
		// 한 문장으로 축약
		System.out.println(se.toString().toCharArray());
		
		
		
		
	} // end main()

} // end class
