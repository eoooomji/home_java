package java09_inheritance.part05;

public class Second extends First {
	int b = 20;

	@Override
	void display() {
		System.out.println("b= " + b);
	}
	
	void superThisMethod() {
		super.display();
		this.display();
	}
	
	@Override
	public String toString() {
		return String.format("b=%d",b);
	}
}
