package java10_abstract.part01;

public class Java68 {

	public static void main(String[] args) {
		// CarAbs car = new CarAbs(); // 추상클래스는 객체 생성 불가능
		SenndaAbs sa = new SenndaAbs();
		sa.work();
		
		TruckAbs ta = new TruckAbs();
		ta.work();
	}

}
