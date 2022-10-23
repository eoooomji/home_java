package java14_api;

import java.util.Calendar;

public class Java111 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());

		int year = cal.get(Calendar.YEAR);

		// MONTH는 1월 일 때 0으로 리턴한다.
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month);

		int date = cal.get(Calendar.DATE);

		// HOUR = 12시간, HOUR_OF_DAY = 24시간
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.printf("%d-%d-%d-%d-%d-%d \n", year, month, date, hour, minute, second);

		// 이번달의 마지막일 리턴
		System.out.println(cal.getActualMaximum(Calendar.DATE));

		// 오늘의 요일 리턴(일요일 : 1 / 토요일 : 7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		// 오늘을 기준으로 5일전의 날짜로 설정
		cal.add(Calendar.DATE, -5);
		System.out.println(cal.toString());

		cal.set(Calendar.YEAR, 2020);
		System.out.println(cal.toString());

		cal.set(2017, 2, 1); // 2017-3-1
		System.out.println(cal.toString());

		// 올해 시작일 부터 오늘까지의 총 일수
		System.out.println(cal.get(cal.DAY_OF_YEAR));

	} // end main()

} // end class
