package java07_class.part06;

public class Java46 {

	public static void main(String[] args) {
		CountVarg cv = new CountVarg();
		cv.addValue(4, 8);
		cv.addValue(23, 2, 6);
		cv.addValue(6, 7, 9, 302, 23);
		cv.addValue(2.65, 1.4);
		cv.sumValue("홍길동", 70, 80, 65);
	}

}
