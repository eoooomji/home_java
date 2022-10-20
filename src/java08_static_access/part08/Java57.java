package java08_static_access.part08;

public class Java57 {

	public static void main(String[] args) {
		Time tm = new Time();
		tm.setHour(12);
		tm.setMinute(10);
		tm.setSecond(35);
		
		System.out.println(tm.toString());
	}

}
