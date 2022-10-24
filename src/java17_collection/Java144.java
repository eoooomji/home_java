package java17_collection;

import java.util.ArrayList;

public class Java144 {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10); // auto-boxing -> up-casting 발생
		aList.add(20);
		aList.add(30);

		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}

		System.out.println("=========================");

		for (Integer it : aList)
			System.out.println(it);

		System.out.println("=========================");

		System.out.println(aList.remove(0));

		System.out.println("=========================");

		for (Integer it : aList)
			System.out.println(it);

		System.out.println("=========================");
		
		System.out.println(aList.remove(new Integer(20))); // true
		
		System.out.println("=========================");
		
		for (Integer it : aList)
			System.out.println(it);

	} // end main()

} // end class
