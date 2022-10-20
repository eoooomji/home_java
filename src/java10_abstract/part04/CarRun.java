package java10_abstract.part04;

public interface CarRun {
	int carCount = 5; // public static final 생략
	
	// public CarRun() {} // 불가능. 인터페이스는 생성자를 가질 수 없다.
	
	void prn(); // abstract public 생략
	
	class Sun{
		public Sun() {
			System.out.println("Sun Consturctor");
		}
	}
}
