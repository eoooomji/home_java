package java15_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java119 {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		FileReader fr = null;

		// FileNotFoundException은 checked exception이다.
		// 반드시 try~catch~finally(예외처리)를 해줘야 한다.
		try {
			fr = new FileReader(file); // compile단계에서 오류 발생.
			System.out.println(fr.read());
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}
	} // end main()

} // end class
