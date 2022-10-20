package java12_api;

public class Java89 {

	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";
		
		// a or r 이면 '_'로 변경
		for(int i = 0 ; i < sn.length() ; i++) {
			char data = sn.charAt(i);
			if(data == 'a' || data == 'r')
				sg += "_";
			else 
				sg += data;
		}
		System.out.println(sg);
		
		System.out.println("Regular Expression을 이용한 문자 변경");
		System.out.println(sn.replaceAll("[ar]","_"));
		
		// sn변수에 저장된 문자열에서 a이거나 r이 포함되어 있으면 true or false를 리턴
		System.out.println(sn.matches(".*[ar].*")); // true
		
		// sn변수에 저장된 문자열에서 a이거나 r로 시작하면 true or false를 리턴
		System.out.println(sn.matches("[ar].*" )); // false
		
		// sn변수에 저장된 문자열에서 a이거나 r로 끝나면 true of false를 리턴
		System.out.println(sn.matches(".*[ar]")); // true
		
		// {2,3} : 2개부터 3개까지의 공백을 "@"로 변경한다.
		String st = "java    korea";
		String sa = st.replaceAll("\\s{2,3}","@");
		System.out.println(sa); // java@ korea
		System.out.println(sa.length()); // 11
		
	}

}
