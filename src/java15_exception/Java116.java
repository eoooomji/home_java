package java15_exception;

public class Java116 {

	public static void main(String[] args) {
		StringBuffer sb = null;
		
		// sb.reverse();
		// Exception in thread "main" java.lang.NullPointerException
		
		try {
			sb.reverse();
		}catch(NullPointerException ex) {
			sb = new StringBuffer("java");
			System.out.println(sb);
		}finally {
			System.out.println("program end");
		}
		
		
	} // end main()

}
