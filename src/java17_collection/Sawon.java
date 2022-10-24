package java17_collection;

public class Sawon {
	private String name;
	private int one;
	private int two;
	private int three;

	public Sawon() {

	}

	public Sawon(String name, int one, int two, int three) {
		this.name = name;
		this.one = one;
		this.two = two;
		this.three = three;
	}

	public int jumsuTotal() {
		return one + two + three;
	}

	@Override
	public String toString() {
		return String.format("%5s %5d %5d %5d %7d \n", name, one, two, three, jumsuTotal());
	}

}
