package java02_statements;

public class Java005 {

	public static void main(String[] args) {
		int num = 3;
		if (num % 2 == 0) {
			System.out.println(num + "는 짝수입니다.");
		} else {
			System.out.println(num + "는 홀수입니다.");
		}

		System.out.println("===================");

		int ber = -10;
		if (ber > 0) {
			System.out.println(ber + "는(은) 자연수입니다.");
			System.out.println("정답입니다");
		}
		System.out.println("program end");

		System.out.println("===================");

		boolean member = false; // 회원(false) or 비회원(true)
		String grade = "VIP"; // 회원등급(VIP , 일반)

		if (!member) {
			if (grade == "VIP") {
				System.out.println("고객님은 " + grade + "이며 " + 30 + '%' + "적립");
			} else {
				System.out.println("고객님은 " + grade + "이며 " + 10 + '%' + "적립");
			}
		} else {
			System.out.println("고객님은 " + grade + "이며 적립이 안되십니다.");
		}

		System.out.println("===================");

		char code = 'D';

		if (code == 'A') {
			System.out.println("식품류");
		} else if (code == 'B') {
			System.out.println("육류");
		} else if (code == 'C') {
			System.out.println("공산품");
		} else if (code == 'D') {
			System.out.println("기타");
		}

		System.out.println("===================");

		char data = 's';

		if (data >= 'A' && data <= 'Z') {
			System.out.printf("%c는 대문자입니다.", data);
		} else if (data >= 'a' && data <= 'z') {
			System.out.printf("%c는 소문자입니다.", data);
		} else {
			System.out.printf("%c는 기타입니다.", data);
		}
	}

}
