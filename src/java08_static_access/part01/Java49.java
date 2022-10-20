package java08_static_access.part01;

public class Java49 {

	public static void main(String[] args) {
		System.out.printf("StaticEx.y=%d \n", StaticEx.y);
		// System.out.printf("StaticEx.x=%d \n", StaticEx.x);
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d, se.y=%d \n", se.x, se.y);
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d, ss.y=%d \n", ss.x, ss.y);
		
		se.x=20;
		se.y=30;
		System.out.printf("se.x=%d, se.y=%d \n", se.x, se.y);
		System.out.printf("ss.x=%d, ss.y=%d \n", ss.x, ss.y);
		
		// static을 선언하면 Heap area 즉, 객체에 생성이 되지 않기 때문에 값을 다르게 선언하면
		// static을 선언한 변수 자체의 값이 변하게 된다.
	}

}
