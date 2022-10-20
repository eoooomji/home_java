package java13_api;

public class Java95 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		String st = sb.toString();
		char[] ch = st.toCharArray();
		display(ch);

	} // end main()

	public static void display(char[] data) {
		for (char cn : data)
			System.out.println(cn);
	}

}// end class
