package java12_api;

/*
 * [출력결과]
 * << 첫 번째 메세지 >>
 * 제품아이디 : PROD-00001 
 * 제품명 : iPhone4
 * 가격 : 940000
 * 수량 : 4
 * 제조사 : 애플
 * << 두 번째 메세지 >>
 * 메세지 형식이 잘못되었습니다.
 * 메세지는 제품아이디:제품명:가격:수량:제조사 형식이어야 합니다.
 */
public class Java85 {

	public static void main(String[] args) {
		System.out.println("<< 첫 번째 메세지 >>");
		handleMessage("PROD-00001:iPhone4:940000:4:애플");
		System.out.println("<< 두 번째 메세지 >>");
		handleMessage("PROD-00002:갤럭시S:960000:삼성");
	}
	
	public static void handleMessage(String sn) {
		String[] arr = sn.split(":");
		if(arr.length <5) {
			System.out.println("메세지 형식이 잘못되었습니다.");
			System.out.println("메세지는 제품아이디:제품명:가격:수량:제조사 형식이어야 합니다..");
		}else {
			System.out.println("제품아이디 : " + arr[0]);
			System.out.println("제품명 : " + arr[1]);
			System.out.println("가격 : " + arr[2]);
			System.out.println("수량 : " + arr[3]);
			System.out.println("제조사 : " + arr[4]);
		}
	}
}
