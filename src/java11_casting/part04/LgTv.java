package java11_casting.part04;

public class LgTv extends HomeTv{
	public LgTv() {
		
	}
	
	public LgTv(String maker) {
		super(maker);
	}
	
	public void call() {
		System.out.println("Lg call");
	}
}