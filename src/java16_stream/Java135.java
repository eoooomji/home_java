package java16_stream;

import java.io.File;

public class Java135 {

	public static void main(String[] args) {
		File file = new File("src/java16_stream/a");

		deleteFileList(file);
	} // end main()

	public static void deleteFileList(File srcFile) {
		// listFiles() : 파일을 목록 및 배열로 가져온다.
		File[] fileAll = srcFile.listFiles();
		System.out.println(fileAll);
		if(fileAll.length != 0) {
			System.out.println(fileAll.length);
			for(File file : fileAll) {
				System.out.println(file);
				deleteFileList(file);
			}
		}
		System.out.println("Remove File" + srcFile.getPath());
		srcFile.delete();
		
	} // end deleteFileList()

} // end class
