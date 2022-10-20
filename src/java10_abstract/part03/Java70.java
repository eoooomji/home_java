package java10_abstract.part03;

public class Java70 {

	public static void main(String[] args) {
		Flute f = new Flute("Flute");
		System.out.println(f.name);
		f.play();
		
		Piano p = new Piano("Piano");
		System.out.println(p.name);
		p.play();
	}

}
