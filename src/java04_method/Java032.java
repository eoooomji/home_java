package java04_method;

public class Java032 {

	public static void main(String[] args) {
		char[] arr = new char[] { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	} // end main()

	public static char[] reverse(char[] data) {
		char[] imsi = new char[data.length]; // 새로운 배열 및 주소로 데이터값 복사
		for (int i = 0; i < imsi.length; i++) {
			imsi[i] = data[data.length - 1 - i];
		}
		return imsi;
	}
} // end class
