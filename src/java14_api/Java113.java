package java14_api;

import java.util.Calendar;

/*
 * 수능일 : 2022-11-17
 * 오늘 : 2022-10-20
 * 남은일 : 27
 */
public class Java113 {

	public static void main(String[] args) {
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2022;
		int examDay_month = 11;
		int examDay_date = 17;

		examDay.set(examDay_year, examDay_month - 1, examDay_date);
		System.out.println(examDay.toString());

		Calendar today = Calendar.getInstance();
		System.out.println(today);

		long eventDay = examDay.getTimeInMillis();
		long nowDay = today.getTimeInMillis();
		System.out.println("eventDay:" + eventDay);
		System.out.println("noDay:" + nowDay);

		System.out.println("수능일:" + examDay_year + '-' + examDay_month + '-' + examDay_date);
		System.out.println("오늘:" + today.get(Calendar.YEAR) + '-' + today.get(Calendar.MONTH + 1) + '-'
				+ today.get(Calendar.DATE));

		long endDay = (eventDay - nowDay) / (60 * 60 * 24 * 1000);
		System.out.println("남은일:" + endDay);

	} // end main()

} // end class
