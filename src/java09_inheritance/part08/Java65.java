package java09_inheritance.part08;

public class Java65 {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.setWater(1000);
		fe.setColor("RED");
		fe.setSpeed(100);
		fe.waterSperad();
		System.out.println(fe.toString());
		
		OwnerEngine oe = new OwnerEngine();
		oe.setSeat(8);
		oe.setColor("BLACK");
		oe.information();
		oe.setSpeed(80);
		System.out.println(oe.toString());
		
		
	}

}
