package java09_inheritance.part06;

public class DogOver extends PetOver {
	@Override
	public void move() {
		System.out.println("서브클래스() : 개가 걸어갑니다.");
	}
}
