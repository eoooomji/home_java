package java01_basic;

public class Java002 {

	public static void main(String[] args) {
		long bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L;
		float fNum = 2.5f;
		double dNum = 7.4;
		char cData = 'a'; // 문자는 하나만 저장이 가능하다. 홑 따옴표 사용
		boolean eNum = true;
		String sData = "j"; // 문자열은 쌍따옴표를 이용한다.
		
		System.out.println(lNum);
		System.out.println(fNum);
		
		// 묵시적 형변환 : int => long 자동으로 큰 데이터 타입으로 형변환이 일어난다.
		long gNum = 6;
		System.out.println(gNum);
		
		// 명시적 형변환 : double => float 할당한 값에 casting타입을 명시해 주어야 한다.
		// float tNum = 2.5;
		// Type mismatch: cannot convert from double to float
		float tNum= (float) 2.5;
		System.out.println(tNum);
		
		// 데이터 손실이 발생되는 경우 
		byte data = (byte) 128;
		System.out.println(data); // -128
		
	}

}
