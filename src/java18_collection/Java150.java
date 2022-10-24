package java18_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Java150 {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();

		Integer it1 = new Integer(10);
		Integer it2 = new Integer(40);
		Integer it3 = new Integer(20);
		Integer it4 = new Integer(30);
		Integer it5 = new Integer(20);

		tree.add(it1);
		tree.add(it2);
		tree.add(it3);
		tree.add(it4);
		tree.add(it5);
		// 중복된 값은 내부에서 처리된다.

		System.out.println("오름차순");
		int cnt = tree.size(); // 중복된 값으로 인해 크기가 달라지므로 고정변수로 값을 복사한다.

//		for (int i = 0; i < cnt; i++) {
//			int value = tree.pollFirst();
//			System.out.println(value == it5);
//			System.out.printf("tree[%d]=%d\n", i, value);
//		}

		for (Integer it : tree)
			System.out.println(it); // 중복값 나오지 않음

		Iterator<Integer> ita = tree.iterator();
		while (ita.hasNext())
			System.out.println(ita.next());

		System.out.println("내림차순");
		Iterator<Integer> ite = tree.descendingIterator(); // 내림차순 메서드
		while (ite.hasNext())
			System.out.println(ite.next());

	} // end main()

} // end class
