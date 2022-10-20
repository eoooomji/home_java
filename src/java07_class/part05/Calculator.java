package java07_class.part05;

public class Calculator {
	void addValue(int x, int y) {
		System.out.println("int, int");
		System.out.println(x + y);
	}

	void addValue(int x, int y, int z) {
		System.out.println("int, int, int");
		System.out.println(x + y + z);
	}

	void addValue(double x, double y) {
		System.out.println("double, double");
		System.out.println(x + y);
	}
}
