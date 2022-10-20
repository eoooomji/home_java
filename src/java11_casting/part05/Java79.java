package java11_casting.part05;

class ExamA {
	void prn1() {
		System.out.println('A');
	}
}

class ExamB extends ExamA {
	void prn2() {
		System.out.println('B');
	}
}

class ExamC extends ExamB {
	void prn3() {
		System.out.println('C');
	}
}

public class Java79 {

	public static void main(String[] args) {
		// 객체 instanceof (비교데이터 타입과 같거나 조상데이터 타입) => ture
		ExamB b = new ExamB();
		System.out.println(b instanceof ExamA); // ture
		b.prn2();
		b.prn1();
		
		ExamA a = new ExamA();
		System.out.println(a instanceof ExamB); // false
		a.prn1();
		
		ExamC c = new ExamC();
		System.out.println(c instanceof ExamA); // ture
		c.prn3();
		
		ExamA ea = new ExamB();
		System.out.println(ea instanceof ExamA); // true
		System.out.println(ea instanceof ExamB); // true
		System.out.println(ea instanceof ExamC); // false
		ea.prn1();
		
		
		
		ExamB d = (ExamB)ea;
		System.out.println(d instanceof ExamA); // ture
		System.out.println(d instanceof ExamB); // ture
		d.prn1();
		d.prn2();
		
		
	}
}
