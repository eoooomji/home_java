package java07_class.part08;

public class Java48 {
	public static void main(String[] args) {

		Employees[] emp = new Employees[2];
		emp[0] = new Employees("John", 5000);
		emp[1] = new Employees("Steven", 8000);
		
		for(Employees data : emp) {
			data.display();
		}
	}
}
