package java09_inheritance.part04;

public class Son extends Parent {
	String dept;

	public Son() {
		
	}

	public Son(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String toStirng() {
		return String.format("%s %d %s \n", name, age, dept);
	}
}
