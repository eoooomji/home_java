package java06_class.part02;

public class Java034 {

	public static void main(String[] args) {
		Book bk = new Book();
		bk.title = "칼의 노래";
		bk.state = false;

		Book bs = new Book();
		bs.title = "어두운 상점의 거리";
		bs.state = true;

		bk.display();
		bs.display();

		bs.borrow();
		bs.display();
	}

}
