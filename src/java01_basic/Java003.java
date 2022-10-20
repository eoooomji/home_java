package java01_basic;

public class Java003 {
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
	System.out.println(bNum + ", " + sNum);
	// 2, 4 : 문자열이 앞뒤로 존재하면 '+' 연산자는 문자열 연산자로 인식한다.
	System.out.println(bNum + sNum);
	// 6 : 문자열이 앞 뒤로 존재하지 않다면 '+' 연산자는 산술 연산자로 인식된다.
	
	System.out.printf("%d %d %d %d %f %f %b %c %s \n", bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData);
	System.out.printf("%d %% %d = %d \n", 5, 2, (5%2));
	
	System.out.print("java");
	System.out.print("program");
	System.out.println();
	System.out.println("jsp");
	System.out.println("test");
	
}
}
