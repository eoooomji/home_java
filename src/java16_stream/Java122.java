package java16_stream;

import java.io.IOException;
import java.io.InputStream;

public class Java122 {

	public static void main(String[] args) {
		System.out.print("데이터입력:");
		InputStream is = System.in;
		int data;

		try {
			while ((data = is.read()) != 13) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end main()

} // end class
