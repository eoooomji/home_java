package java07_class.part08;

public class Employees {
	String name;
	int salary;
	
	public Employees() {
		
	}

	public Employees(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.printf("%s %d \n", name, salary);
	}
}
