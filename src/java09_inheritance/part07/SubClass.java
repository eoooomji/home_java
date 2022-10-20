package java09_inheritance.part07;

public class SubClass extends SuperClass {
	public SubClass() {
		
	}
	
	public SubClass(int a, int b, int c) {
		super(a,b,c);
		display();
		sumData();
	}
	
	public void sumData() {
		System.out.println("합 : " + (x + y + z));
	}

}
