package java16_stream;

import java.io.File;

public class Java134 {

	public static void main(String[] args) {
		File file = new File("src/java16_stream/test.txt");

		if (file.exists()) {
			file.delete();
			System.out.println("파일 삭제");
		} else {
			System.out.println("파일 없음");
		}
	} // end main()

} // end class
