package java10_abstract.part02;

public class Java69 {

	public static void main(String[] args) {
		Rect rect = new Rect(10, 20);
		System.out.println("사각형 넓이 : " + rect.getArea());

		Tri tri = new Tri(10, 20);
		System.out.println("삼각형 넓이 : " + tri.getArea());
	}

}
