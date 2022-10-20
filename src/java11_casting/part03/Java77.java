package java11_casting.part03;

public class Java77 {

	public static void main(String[] args) {
		LgTv lg = new LgTv("Lg");
		process(lg);
		
		SamsungTv ss = new SamsungTv("Samsung");
		process(ss);
		
	}
	
	public static void process(SamsungTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.move();
	}
	
	public static void process(LgTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.call();
	}

}
