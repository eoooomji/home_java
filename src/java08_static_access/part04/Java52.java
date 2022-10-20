package java08_static_access.part04;

// javac -d . Java52_args.java
// java java08_static_access.part04.Java52_args hello world 2022
// 리눅스 버전
public class Java52 {

	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
		for(String data : args) {
			System.out.println(data);
		}
		
		// main메서드 String[] args 사용하는 방법
		// 우클릭 > run as > run configurations > arguments 값 작성
	}

}