package java16_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Java126 {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists()); // false
		System.out.println(file.isFile()); // false
		System.out.println(file.length()); // 0

		FileWriter fw = null;

		try {
			fw = new FileWriter(file, false);
			fw.write("java\n"); // buffer에 저장
			fw.flush(); // buffer값 불러오기
			fw.write("jsp\n");
			fw.flush();
			fw.write(new char[] { 's', 'p', 'r', 'i', 'n', 'g' });
			fw.write("\n");
			fw.flush();
			fw.write(97); // 유니코드
			fw.write("\n");
			fw.flush();
			fw.write(new char[] { 's', 'p', 'r', 'i', 'n', 'g' }, 0, 3); // 0인덱스 ~ 3인덱스미만
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // end main()

} // end class
