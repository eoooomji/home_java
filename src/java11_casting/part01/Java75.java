package java11_casting.part01;

public class Java75 {
 
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		// 업캐스팅(up-casting)
		// Parent p = new Child();
		p = c;
		p.process();
		// p.call(); // Parent클래스에 존재하지 않아 불러올 수 없다.
		
		// 다운캐스팅(down-casting)
		Child d = (Child)p; 
		d.call();
		d.process();
	}
}
