package java18_collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Java152 {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");

		System.out.println(table.get(10));

		System.out.println("=== Enumeration ===");

		Enumeration<String> enu = table.elements();
		// value 가져오기
		while (enu.hasMoreElements())
			System.out.println(enu.nextElement());

		Enumeration<Integer> enuKey = table.keys();
		// key 가져오기
		while (enuKey.hasMoreElements()) {
			// System.out.println(enuKey.nextElement());
			Integer key = enuKey.nextElement();
			System.out.printf("%d:%s\n", key, table.get(key));
		}

		Set<Integer> st = table.keySet();
		for (Integer key : st)
			System.out.printf("%d:%s\n", key, table.get(key));
	} // end main()

} // end class
