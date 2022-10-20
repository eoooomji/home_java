package java10_abstract.part02;

public class Tri extends Shape {
	public Tri() {
	}

	public Tri(int width, int height) {
		super(width, height);
	}

	@Override
	double getArea() {
		return getWidth() * getHeight() / 2;
	}
}
