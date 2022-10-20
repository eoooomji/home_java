package java02_statements;

public class Java006 {

	public static void main(String[] args) {
		int jumsu = 100;
		switch (jumsu / 10) {
		case 10:
		case 9:
			System.out.println('A');
			break;
		case 8:
			System.out.println('B');
			break;
		}

		System.out.println("===================");

		int year = 2021;
		int month = 2;
		int lastDay;

		if (!(month >= 1 && month <= 12)) {
			System.out.println("1월 ~ 12월만 가능합니다.");
		}

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;
		default:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				lastDay = 29;
			} else {
				lastDay = 28;
			}
			break;

		}
		System.out.printf("%d년도의 %d월의 마지막일은 %d입니다. \n", year, month, lastDay);

		System.out.println("===================");

		String color = "red";

		switch (color) {
		case "red":
			System.out.println("#ff0000");
			break;
		case "blue":
			System.out.println("#0000ff");
			break;
		case "green":
			System.out.println("#00ff00");
			break;
		case "white":
			System.out.println("#ffffff");
			break;
		case "black":
			System.out.println("000000");
			break;
		}
	}

}
