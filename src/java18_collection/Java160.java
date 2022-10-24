package java18_collection;

public class Java160 {

	public static void main(String[] args) {
		String a = "ABCawser24";
		String b = "ABC";
		String d = "ABC";
		String e = "ab";

		// 앞에 문자열이 같고 길이가 다르면 길이를 비교한다.
		System.out.println(a.compareTo(b)); // 7
		System.out.println(b.compareTo(a)); // -7

		System.out.println(b.compareTo(d)); // 0

		System.out.println(b.compareTo(e)); // -32 = 65 - 97
		System.out.println(e.compareTo(b)); // 32 = 97 - 65
	} // end main()

} // end class
