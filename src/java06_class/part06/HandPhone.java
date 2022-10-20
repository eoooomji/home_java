package java06_class.part06;

public class HandPhone {
	String name;
	String number;

	HandPhone() {
	}
	
	HandPhone(String name){
		this.name = name;
	}
	
	HandPhone(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	// 메소드
	void display() {
		System.out.printf("%s %s \n", name, number);
	}
}
