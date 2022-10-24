package java16_stream;

import java.io.File;
import java.io.IOException;

public class Java133 {

	public static void main(String[] args) {
		File file = new File("src/java16_stream/test.txt");

		if (!file.exists()) { // 파일 존재 여부 확인
			try {
				file.createNewFile(); // 파일 생성
				System.out.println("파일 생성");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // end main()

} // end class
