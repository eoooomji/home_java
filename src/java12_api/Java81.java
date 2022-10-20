package java12_api;

public class Java81 {

	public static void main(String[] args) {
		// heap area에서 같은 주소의 "java"를 가르킨다.
		String sn = "java";
		String sg = "java";
		
		String st = new String("java");
		String ss = new String("java");
		
		// 주소비교
		System.out.printf("sn==sg : %b \n", sn==sg); // ture
		System.out.printf("st==ss : %b \n", st==ss); // false
		
		// 메모리에 저장된 문자열 비교
		System.out.printf("sn.equals(sg): %b \n", sn.equals(sg)); // true
		System.out.printf("st.equals(ss): %b \n", st.equals(ss)); // true
		
		// 메모리에 저장된 문자열 리턴
		System.out.println(sn.toString());
		System.out.println(sn);
	}

}
