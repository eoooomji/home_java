package java13_api;

public class Java105 {

	public static void main(String[] args) {
		String data = "123";

		// String -> Integer(객체)
		Integer it = new Integer(data);

		// Integer -> int
		int num = it.intValue();

		System.out.println(num);

		// String -> Integer
		Integer ig = Integer.valueOf(data);
		int num2 = ig; // auto-unboxing 발생
		System.out.println(num2);

		// Integer -> double
		double pro = it.doubleValue();
		System.out.println(pro);

		double pro2 = it; // auto-unboxing

		// Integer -> long
		long nn = it.longValue();
		System.out.println(nn);
		long nn2 = it; // auto-unboxing;
		System.out.println(nn2);

		Double db = new Double(data);
		Double de = Double.valueOf(data);
		int x = de.intValue();
		System.out.println(x);
		// 크기 차이로 auto-unboxing이 안됨
		// int x2 = (int)de; // de는 객체이다.
		// System.out.println(x2);
		// Cannot cast from Double to int

		double y = de.doubleValue();
		System.out.println(y);
		double y2 = de; // auto-unboxing
		System.out.println(y2);

		// String => int
		int a = Integer.parseInt(data);
		System.out.println("a=" + a);

		// String => byte
		byte b = Byte.parseByte(data);
		System.out.println("b=" + b);
		
		// String => double
		double c = Double.parseDouble(data);
		System.out.println("c="+c);
		
		boolean numBoolean = Boolean.parseBoolean(data);
		System.out.println("numBoolean="+numBoolean); // false
		
		numBoolean = Boolean.parseBoolean("true");
		System.out.println("numBoolean="+numBoolean); // true
		
		numBoolean = Boolean.parseBoolean("false");
		System.out.println("numBoolean="+numBoolean); // false
		// boolean에서는 true를 제외하고는 모두다 false이다.
		
		
		String ss = String.valueOf(1);
		System.out.println(ss); // 1
		Double da = Double.valueOf("1");
		System.out.println(da); // 1.0
		double dt =da; // auto-unboxing 실행으로 인해 가능하다.
		System.out.println(dt); 
		
		int k = 10;
		Integer in = new Integer(k); // stack > heap
		Integer is = k; // auto-boxing 실행으로 인해 가능하다.
		System.out.println(is);
		System.out.println(is == k); // true
		
		int m = is; // auto-unboxing 실행으로 인해 가능하다.
		
		double dm = 4.5;
		Double valDouble = dm; // auto-boxing 실행
		double dn = valDouble; // auto-unboxing 실행
		
		String ko = "90";
		Double dp = Double.valueOf(ko); // String -> Double
		String kt = dp.toString(); // Double -> String / toString() : 모든 객체를 String객체로 바꿔주는 기능
		double kd = Double.parseDouble(ko); // String -> double
		
		
		
		
		
		

	} // end main()

} // end class
