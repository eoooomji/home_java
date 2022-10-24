package java17_collection;

import java.util.ArrayList;

public class Java145 {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);

	} // end main()

	public static void prnDisplay(ArrayList<String> aList) {
		// aList 매개변수의 요소에서 'j'나 'J'가 포함되어 있는 요소만 출력하는 프로그램 구현
		for (String sn : aList)
			if (sn.toLowerCase().contains("j"))
				System.out.println(sn);
		// contains() : 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 메서드
		// aList가 문자열 배열이고 개선된 for문을 통해 String 문자로 나눠준다.
		// 그리고 소문자로 바꾸어 준 뒤 'j'가 포함되어 있는지 함수를 사용하여 출력한다.
	} // end prnDisplay()

	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("jsp"));
	} // end process()

}
// end class
