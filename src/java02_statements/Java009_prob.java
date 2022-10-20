package java02_statements;

public class Java009_prob {

	public static void main(String[] args) {

		int year = 2013;
		String animal = " ";

		switch (year % 12) {
		case 0:
			animal = "원숭이";
			break;
		case 1:
			animal = "닭";
			break;
		case 2:
			animal = "개";
			break;
		case 3:
			animal = "돼지";
			break;
		case 4:
			animal = "쥐";
			break;
		case 5:
			animal = "소";
			break;
		case 6:
			animal = "호랑이";
			break;
		case 7:
			animal = "토끼";
			break;
		case 8:
			animal = "용";
			break;
		case 9:
			animal = "뱀";
			break;
		case 10:
			animal = "말";
			break;
		case 11:
			animal = "양";
			break;
		}
		System.out.printf("%d년도의 태생은 %s띠입니다. \n", year, animal);

		System.out.println("===================");

		char code = 'B';
		String menu = "";
		int price = 0;

		switch (code) {
		case 'A':
			price = 7500;
			menu = "짬뽕";
			break;
		case 'B':
			price = 6000;
			menu = "만두";
			break;
		case 'C':
			price = 5000;
			menu = "짜장";
			break;
		case 'D':
			price = 4000;
			menu = "라면";
			break;
		default:
			System.out.println("제공하지 않는 메뉴입니다.");
		}
		System.out.printf("%s메뉴 가격은 %d원입니다. \n", menu, price);

		System.out.println("===================");

		int sc = 2; // 판매 수량
		int sm = 11000; // 판매 단가
		String del = "퀵"; // 배달 방법
		int product = sc * sm; // 물품 금액
		int delm = 0; // 배달 금액
		int total = 0; // 총 금액

//		if(product >= 30000) {
//			total = product + delm;
//		}else if(del != "퀵") {
//			delm += 3000;
//			total = product + delm;
//		}else {
//			delm += 12000;
//			total = product + delm;
//		}

		if (product < 30000) {
			if (del == "일반") {
				delm = 3000;
			} else if (del == "퀵") {
				delm = 12000;
			}
		} else {
			delm = 0;
		}
		total = product + delm;
		System.out.printf("물품금액 : %d원 \n", product);
		System.out.printf("배달금액 : %d원 \n", delm);
		System.out.printf("총 금액 : %d원 \n", total);

		System.out.println("===================");

		int kor = 75;
		int eng = 80;
		int mat = 30;
		int tot = kor + eng + mat;
		double avg = tot / 3;
		if (avg >= 60.0) {
//			if(kor >=40 && eng >=40 && mat >=40) {
//				System.out.println("합격을 축하합니다.");
//			}else if(kor <40 || eng <40 || mat < 40) {
//				System.out.println("과락으로 불합격입니다.");
//			}
			if (!(kor >= 40 && eng >= 40 && mat >= 40)) {
				System.out.println("과락으로 불합격입니다.");
			} else {
				System.out.println("합격을 축하합니다.");
			}
		} else {
			System.out.println("불합격입니다.");
		}

		System.out.println("===================");

		int carNum = 5;
		String day = "";

		switch (carNum) {
		case 1:
		case 6:
			day = "월요일";
			break;
		case 2:
		case 7:
			day = "화요일";
		case 3:
		case 8:
			day = "수요일";
		case 4:
		case 9:
			day = "목요일";
		case 5:
		case 0:
			day = "금요일";
		}
		System.out.printf("차량번호의 끝자리가 %d인 차량은 %s운행을 제한합니다. \n", carNum, day);

		System.out.println("===================");

		String grade = "과장";
		int overtime = 1;
		int money = 0;

		switch (grade) {
		case "과장":
			money = 250;
			break;
		case "대리":
			money = 200;
			break;
		case "사원":
			money = 150;
			break;
		}
		if (overtime >= 20) {
			money += 20;
		} else if (overtime >= 10 && overtime < 20) {
			money += 10;
		} else {
		}
		System.out.printf("직급은 %s이며, 이번달 초과근무는 총 %d시간을 하셨습니다. \n", grade, overtime);
		System.out.printf("수령하실 월급은 %d입니다. \n", money);

	} // end main()

} // end class
