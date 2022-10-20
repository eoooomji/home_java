package java09_inheritance.part10;

public class Java67 {

	public static void main(String[] args) {
		BasicTv btv = new BasicTv();
		btv.isPowerOn = true;
		btv.channel = 6;
		btv.volume = 10;
		btv.display();
		
		System.out.println("===============");
		
		SmartTv stv = new SmartTv();
		stv.isPowerOn = true;
		stv.channel = 10;
		stv.volume = 7;
		stv.ip = "192.30.400.2";
		stv.display();
	}

}
