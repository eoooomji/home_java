package java18_collection;

import java.util.HashSet;

public class Java151 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));

		for (Integer it : set)
			System.out.println(it);
	} // end main()

} // end class
