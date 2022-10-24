package java18_collection;

public class Java156 {

	public static void main(String[] args) {
		Integer[] it = new Integer[] { 1, 5, 3, 2 };
		Average<Integer> av = new Average<Integer>(it);
		System.out.println(av.findAverage());

		Number[] nb = new Number[] { 2, 5.3f, 4.6 };
		Average<Number> ae = new Average<Number>(nb);
		System.out.println(ae.findAverage());

		String[] sn = new String[] { "java", "jsp" };
		// Average<String> as = new Average<String>();
		// 타입 미스매치 Number만 extends 하였기에 문자열은 안된다.
		// Bound mismatch: The type String is not a valid substitute for the bounded
		// parameter <T extends Number> of the type Average<T>

	} // end main()

} // end class
