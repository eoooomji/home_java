package java18_collection;

import java.util.TreeMap;

public class Java154 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(10, "java");
		tmap.put(20, "jsp");
		tmap.put(30, "spring");

		for (Integer key : tmap.keySet())
			System.out.printf("%d:%s\n", key, tmap.get(key));
	} // end main()

} // end class
