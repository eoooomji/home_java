package java12_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java90 {

	public static void main(String[] args) {
		String sn = "12345";
		String sb = "2bsba5";
		String st = "aetwef";

		// a-zA-Z_*$(문자를 의미)가 sn변수에 포함이 되어 있으면 true or false를 리턴
		System.out.println(sn.matches(".*[a-zA-Z_*$].*")); // false

		// sn변수에 숫자 0-9가 포함되어 있으면 true or false를 리턴
		System.out.println(sn.matches(".*[0-9].*")); // true
		System.out.println(sn.matches(".*[\\d].*")); // true
		System.out.println(sn.matches(".*\\d.*")); // true

		// sn변수에 숫자 0-9가 포함되어 있지 않으면 true or false를 리턴
		System.out.println(sn.matches(".*[^0-9].*")); // false
		System.out.println(sn.matches(".*[\\D].*")); // false

		System.out.println("================");

		// sb변수에 저장된 값이 2로 시작되면 true or false를 리턴
		System.out.println(sb.matches("2.*")); // true

		// sb변수에 저장된 값이 2로 시작되고 5로 끝나면 true of false를 리턴
		System.out.println(sb.matches("2.*5")); // true

		// sb변수에 저장된 값이 a이거나 b로 시작하고 임의문자가 5개이면 true or false를 리턴
		System.out.println(sb.matches("[ab].{5}")); // false

		// st변수에 저장된 값이 a이거나 b로 시작하고 임의문자가 1~5개이며 cc로 끝나면 true or false를 리턴
		st = "aetwefcc";
		System.out.println(st.matches("[ab].{1,5}cc")); // true

		System.out.println("================");

		String input1 = "3absfa";
		System.out.println(input1.matches("\\d")); // false
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input1);
		System.out.println(mc); // java.util.regex.Matcher[pattern=\d region=0,6 lastmatch=]
		System.out.println(mc.find()); // true
		System.out.println(mc.find(0)); // true

		System.out.println(Pattern.compile("\\d").matcher(input1).find()); // true
		System.out.println(Pattern.compile("\\d").matcher(input1).find(0)); // true
		// 위 두 sysout은 동일하다. 다르게 작성할 수 있다.

		// 조건 : 데이터, 길이 : 5~10, 숫자와 영문 포함
		input1 = "wwfwfg3awq";
		System.out.println(input1.matches("[\\w]{5,10}") && Pattern.compile("[0-9]").matcher(input1).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input1).find()); // ture

		System.out.println("================");

		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res); // true

		Pattern pt = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mh = pt.matcher(str);
		System.out.println(mh); // java.util.regex.Matcher[pattern=best region=0,42 lastmatch=]
		int i = 1;
		while (mh.find())
			System.out.printf("%d번째 %d~%d %s \n", i++, mh.start(), mh.end(), mh.group());
		// 1번째 4~8 BEst 
		// 2번째 19~23 best 
		// 3번째 33~37 best
		
		System.out.println("================");
		
		str = "The BEst10 things in best20 life are best30 free best40";
		pt = Pattern.compile("(best)(10|20|30)",Pattern.CASE_INSENSITIVE);
		mh = pt.matcher(str);
		i =1;
		while(mh.find())
			System.out.printf("%d번째 %d~%d %s \n", i++, mh.start(), mh.end(), mh.group());
		// 1번째 4~10 BEst10 
		// 2번째 21~27 best20 
		// 3번째 37~43 best30 
		
	}

}
