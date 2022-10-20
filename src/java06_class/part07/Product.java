package java06_class.part07;

public class Product {
	String code;
	String pname;
	int cnt;
	
	public Product() {
		this("p002", "식품", 3000);
	}
	
	public Product(String code, String pname, int cnt) {
		super();
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}
	
	void display() {
		System.out.printf("%s %s %d \n", code, pname,cnt);
	}
	
	void prn() {
		this.display();
	}

}
