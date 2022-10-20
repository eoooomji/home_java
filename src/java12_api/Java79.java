package java12_api;

public class Java79 {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		int x = 5;
		int y = 5;
		// 값비교(기본데이터타입)
		System.out.printf("x=%d y=%d x==y:%b \n", x, y, x==y); // ture
		
		Object ojt = new Object();
		// 주소비교(참조데이터타입)
		System.out.printf("obj==ojt : %b \n", obj==ojt); //false
		
		// equals() : 주소비교(객체비교만 가능하다.)
		System.out.printf("obj.equals(ojt) : %b \n",obj.equals(ojt)); // false
		
		// class java.lang.Object
		System.out.println(obj.getClass());
		
		// java.lang.Object
		System.out.println(obj.getClass().getName());
		
		// hashCode() : 메모리 값
		int num = obj.hashCode();
		System.out.println(num);
		
	}

}
