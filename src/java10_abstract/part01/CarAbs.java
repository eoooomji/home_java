package java10_abstract.part01;

abstract public class CarAbs {
	int speed;
	String color;

	public CarAbs() {

	}

	abstract public void work();

	public void display() {
		System.out.printf("%d %s \n", speed, color);
	}
}
