package java17_collection;

import java.util.Vector;

public class Java138 {

	public static void main(String[] args) {
		Vector v = new Vector();
		// Integer -> Object : up-casting
		// Vector에 들어가는 값은 요소(element)이다.
		// 컬렉션에 들어가는 모든 요소들은 Object로 리턴된다.
		v.add(new Integer(10));
		v.add(new Integer(20));

		// int -> Integer -> Object : auto-boxing -> up-casting
		v.add(30);
		v.add(40);

		// String -> Object : up-casting
		v.add(new String("java"));

		// Object -> Integer : down-casting
		Integer it1 = (Integer) v.get(0);
		Integer it2 = (Integer) v.get(1);
		Integer it3 = (Integer) v.get(2);
		Integer it4 = (Integer) v.get(3);
		String sn = (String) v.get(4);
		System.out.println(it1.intValue());
		System.out.println(it2.intValue());
		System.out.println(it3.intValue());
		System.out.println(it4.intValue());
		System.out.println(sn.toString());
		try {
			System.out.println(v.get(20));
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}

	} // end main()

} // end class
