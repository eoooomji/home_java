package java18_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Java153 {

	public static void main(String[] args) {
		HashMap<Integer, Number> map = new HashMap<Integer, Number>();
		map.put(1, new Integer(10)); // map.put(1, 10);
		map.put(2, new Double(4.5)); // map.put(2, 4.5);
		map.put(3, new Float(2.5f)); // map.put(3, 2.5f);

		System.out.println(map.get(2));

		Set<Integer> set = map.keySet();
		Iterator<Integer> ite = set.iterator();
		while (ite.hasNext()) {
			Integer key = ite.next();
			System.out.printf("%d:%s\n", key, map.get(key));
		}

		for (Integer key : map.keySet())
			System.out.printf("%d:%s\n", key, map.get(key));

	} // end main()

} // end class
