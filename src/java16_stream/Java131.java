package java16_stream;

import java.io.File;

public class Java131 {

	public static void main(String[] args) {
		File file = new File("src/java16_stream/a/b");
		// is 나 has로 시작하는 클래스는 true나 false를 리턴한다.

		if (!file.isDirectory()) {
			file.mkdirs();
			System.out.println("폴더 생성");
		} else {
			System.out.println("폴더 존재");
		}
	} // end main()

} // end class
