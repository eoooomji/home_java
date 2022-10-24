package java16_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java127 {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		FileReader fr = null;
		int data;

		try {
			fr = new FileReader(file);
			// for(long i = 0 ; i < file.length();i++)
			// System.out.println((char)fr.read());
			while ((data = fr.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end main()

} // end class
