package java16_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java132 {

	public static void main(String[] args) throws IOException {
		// File file = new File("src/java016_stream/a/b");
		File file = new File("src/java016_stream/sample.txt");
		
		file.deleteOnExit();
		
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();
		// close()를 안해주면 Scanner가 계속 실행되기 때문에 deleteOnExit()이 작동하지 않아 파일이 삭제되지 않는다.
		
		
		
		
	} // end main()

} // end class
