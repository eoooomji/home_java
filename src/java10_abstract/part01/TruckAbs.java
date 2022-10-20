package java10_abstract.part01;

public class TruckAbs extends CarAbs {
	public TruckAbs() {
		
	}
	
	@Override
	public void work() {
		System.out.println("트럭에 짐을 싣고 있다.");
	}
}
