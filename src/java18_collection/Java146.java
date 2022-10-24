package java18_collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Java146 {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		// append
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));

		// insert
		aList.add(1, new String("mysql")); // 1번째 인덱스에 추가

		// remove
		aList.remove(2); // 2번째 인덱스 제거

		for (int i = 0; i < aList.size(); i++)
			System.out.printf("aList[%d]=%s\n", i, aList.get(i));

		System.out.println("=== LinkedList ===");
		LinkedList<String> aNode = new LinkedList<String>();
		// append
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));

		// insert
		aNode.add(1, new String("mysql"));

		// remove
		// 무조건 첫번째 요소 삭제
		aNode.remove();
		// 마지막 요소 삭제
		aNode.removeLast();
		// 특정 인덱스 요소 삭제
		aNode.remove(1);

		for (int i = 0; i < aNode.size(); i++)
			System.out.printf("aNode[%d]=%s\n", i, aNode.get(i));

	} // end main()

} // end class
