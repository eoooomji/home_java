package java17_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

/*
 * [프로그램 출력결과]
 * kim	56	78	12	146
 * hong	46	100	97	243
 * park	96	56	88	240
 */
public class Java143 {

	public static void main(String[] args) {
		String path = "./src/java17_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);

	} // end main()

	public static Vector<Sawon> lines(String fileName) {
		// strName 매개변수 값을 이용해서 Vector에 데이터를 저장한 후 리턴하는 프로그램 구현
		Vector<Sawon> vt = new Vector<Sawon>();
		try (Scanner sc = new Scanner(new File(fileName))) {
			while (sc.hasNextLine()) { // line글이 있다면 true
				String[] data = sc.nextLine().split("[:/]");
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
				vt.add(sn);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}

		return vt;
	}

	public static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출렬결과와 같이 프로그램을 구현하시오.
		for (Sawon sn : vt)
			System.out.println(sn.toString());
	}

} // end class
