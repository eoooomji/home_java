package java10_abstract.part07;

public class FinalTest {
	final int CODE = 1; // final이 선언된 변수는 초기값을 할당해야 한다. 대문자로 쓰길 권장
	
	public FinalTest() {
		
	}
	
	void display() {
		System.out.println("display");
	}
	
	final void process() {
		System.out.println("process");
	}
}
