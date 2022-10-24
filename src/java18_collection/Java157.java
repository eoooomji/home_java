package java18_collection;

class Seoul {
	public void showYou() {
		System.out.println("seoul");
	}
}

class Fruit extends Seoul {
	@Override
	public void showYou() {
		System.out.println("Fruit");
	}
}

class Apple extends Fruit {
	@Override
	public void showYou() {
		System.out.println("Apple");
	}
}

class Orange extends Fruit {
	@Override
	public void showYou() {
		System.out.println("Orange");
	}
}

class FruitBox<T> {
	private T item;

	public FruitBox() {

	}

	public void store(T item) {
		this.item = item;
	}

	public T pullout() {
		return item;
	}
}

public class Java157 {

	public static void main(String[] args) {
		FruitBox<Orange> fOrange = new FruitBox<Orange>();

		fOrange.store(new Orange());
		openAndAllBox(fOrange);
		openAndExtendsBox(fOrange);
		// openAndsuperBox(fOrange); // Orange는 Fruit의 자손이기 때문에 값을 못받는다.

		FruitBox<Seoul> fSeoul = new FruitBox<Seoul>();
		fSeoul.store(new Seoul());
		openAndAllBox(fSeoul);
		// openAndExtendsBox(fSeoul); // Fruit의 자손은 Apple과 Orange이다.
		openAndsuperBox(fSeoul);

	} // end main()

	public static void openAndAllBox(FruitBox<?> param) {
		System.out.println(param.pullout());
		((Seoul) param.pullout()).showYou(); // 다운캐스팅
	}

	public static void openAndExtendsBox(FruitBox<? extends Fruit> param) {
		param.pullout().showYou();
	}

	public static void openAndsuperBox(FruitBox<? super Fruit> param) {
		((Seoul) param.pullout()).showYou(); // 다운 캐스팅
	}

} // end class
