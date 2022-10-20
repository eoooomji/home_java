package java07_class.part07;

public class Java47 {

	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		for(int i = 0; i<num.length ; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("=================");
		
		for(int element : num) {
			System.out.println(element);
		}
	} // end main()

} // end class
