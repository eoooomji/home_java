package java06_class.part01;

public class Java033 {

	public static void main(String[] args) {
		Person ps; // 객체참조변수 선언. 4바이트
		ps = new Person(); // 객체 생성 (생성자 초기값을 주지 않으면 기본값을 가져온다.)
		
		ps.name = "홍길동";
		ps.age = 30;
		ps.gender = '남';
		ps.develop();
		ps.run(100); // 값을 주게 되면 stack area에 지역변수로(ps.run) 100이 저장된다.
		
		System.out.printf("%s, %d, %c \n", ps.name, ps.age, ps.gender);
	}

}
