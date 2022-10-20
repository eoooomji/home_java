package java12_api;

/*
 * [출력결과]
 * 35276은 숫자입니다.
 * 2_8a는 문자입니다.
 */
public class Java87 {

	public static void main(String[] args) {
		System.out.print("35276은");
		prnDisplay(numCheck("35276"));
		
		System.out.print("2_8a는");
		prnDisplay(numCheck("2_8a"));
	}
	
	public static boolean numCheck(String data) {
		// data값이 숫자면 true 아니면 false를 반환하는 로직 구현
		for(int i = 0; i < data.length() ; i++) {
			if(!(data.charAt(i)>='0'&&data.charAt(i) <='9'))
				// 숫자가 아니면 true이고 true의 return값을 false로 주었다.
				return false;
		}
		return true;
	}
	
	public static void prnDisplay(boolean chk) {
		// chk값이 true이면 "숫자입니다." / chk값이 false이면 "문자입니다." 리턴
		if(chk)
			System.out.println("숫자입니다.");
		else
			System.out.println("문자입니다.");
	}

}
