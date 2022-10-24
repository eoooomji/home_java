package java18_collection;

import java.util.Vector;

public class Java158 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("java");
		v.add("jsp");
		v.add("spring");

		System.out.println(v.toString()); // [java, jsp, spring]

		Vector<String> t = new Vector<String>();
		t.add("java");
		t.add("mysql");

		System.out.println(t.toString()); // [java, mysql]
		System.out.println(t.toString().length()); // 13 : 대괄호, 공백까지 합쳐서 길이값 리턴
		
		// 배열처럼 리턴값이 나오지만 배열이 아니라 String이다.
		
		v.removeAll(t); // v.toString() - t.toString() 
		System.out.println(v.toString());

	} // end main()

} // end class
