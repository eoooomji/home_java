package java16_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java130 {

	public static void main(String[] args) {
		File file = new File("src/java16_stream/song.txt");

		// \r\n (줄바꿈, 엔터를 의미) : 인덱스 값을 차지한다.
		RandomAccessFile raf = null;
		String stn = new String("\r\nMaroon5 - Daylight, Sunday Morning \r\n");

		try {
			raf = new RandomAccessFile(file, "rw");
			System.out.println(raf.getFilePointer());

			// sonh.txt파일의 총 길이를 리턴한다.
			long size = raf.length();

			// 파일의 끝으로 포인터를 이동한다.
			raf.seek(size);
			System.out.println(raf.getFilePointer());

			// 파일 대상에 데이터를 보낸다.
			raf.writeUTF(stn);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end main()

} // end class
