package java09_inheritance.part10;

public class SmartTv extends BasicTv{
	String ip;
	
	@Override
	public void display() {
		super.display();
		System.out.println("IP : " + ip);
	}
}
