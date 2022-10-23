package java14_api;

import java.text.SimpleDateFormat;

public class Java110 {

	public static void main(String[] args) {
		long curr = System.currentTimeMillis();
		System.out.println(curr);
		
		
		// 연도-월-일 시간:분:초 오전/오후 요일
		String pattern = "yyyy-MM-dd HH:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); // object
		
		// long -> Long      => Object 
		// auto-boxing(발생)  => up-casting(발생)
		String date = sdf.format(curr); // format의 타입은 object
		System.out.println(date);
		
		
	} // end main()

} // end class
