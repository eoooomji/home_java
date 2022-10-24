package java18_collection;

import java.util.LinkedList;

public class Java148 {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		
		// append
		// push : 입력한 순서대로 데이터가 쌓인다.
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));
		
		// pop : 마지막에 저장된 순서로 데이터를 꺼낸다.(포인터 위치에 따라 다르다.)
		// System.out.println(nStack.pop());
		// System.out.println(nStack.pop());
		// System.out.println(nStack.pop());
		// System.out.println(nStack.pop()); // java.util.NoSuchElementException
		
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
		
		
	} // end main()

} // end class
