package java06_class.part08;

public class Employees {
	String name;
	String dept;
	int salary;
	
	// 생성자를 만들어도 기본값을 생성해 두면 나중에 처리하기 편하다.
	public Employees() {
		
	}
	
	public Employees(String name) {
		this("보류", 3000);
		this.name = name;
	}
	
	public Employees(int salary) {
		this.salary = salary;
	}
	
	public Employees(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
	}

	public Employees(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s %s %d \n", name, dept, salary);
	}
}
