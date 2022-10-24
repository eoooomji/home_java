package java18_collection;

import java.util.LinkedList;

public class Java149 {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();

		// append
		// offer() : Queue사용을 하기 위한 저장 메서드
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));

		// poll() : 저장한 순서대로 꺼내주는 메서드
		while (!nQueue.isEmpty())
			System.out.println(nQueue.poll());

	} // end main()

} // end class
