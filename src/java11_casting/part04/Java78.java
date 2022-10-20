package java11_casting.part04;

public class Java78 {

	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		process(lg);

		SamsungTv ss = new SamsungTv("Samsung");
		process(ss);

	}

	public static void process(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();
		if (tv instanceof SamsungTv) {
			SamsungTv stv = (SamsungTv) tv;
			stv.move();
		} else if (tv instanceof LgTv) {
			LgTv ltv = (LgTv) tv;
			ltv.call();
		}
	}

}
