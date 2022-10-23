package java16_stream;

import java.io.IOException;
import java.io.InputStream;

public class Java121 {

	public static void main(String[] args) {
		System.out.print("데이터 입력:");
		InputStream is = System.in;

		try {
			int line = is.read();
			// 1바이트를 읽어와 유니코드를 리턴한다. 한글은 읽을 수 없다.
			System.out.println(line);
			System.out.println((char) line);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	} // end main()

} // end class
