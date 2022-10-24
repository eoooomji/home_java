package java17_collection;

import java.util.Vector;

public class Java142 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement(new String("java")); // append, Vector에만 존재하는 api
		v.add(new String("jsp")); // append
		v.add(1, new String("spring")); // insert(삽입)

		for (int i = 0; i < v.size(); i++) {
			System.out.printf("v[%d]=%s\n", i, v.get(i));
		}

		// 요소가 저장되어 있지 않은 메모리는 제거가 가능하다.
		v.trimToSize();

		System.out.println("용량크기:" + v.capacity()); // 메모리 제거 전: 10 / 메모리 제거 후 : 3
		System.out.println("요소개수:" + v.size()); // 3

	} // end main()

} // end class