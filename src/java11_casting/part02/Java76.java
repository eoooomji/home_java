package java11_casting.part02;

public class Java76 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Steven", "cod001");
		process(emp);
		
		Manager mg = new Manager("Neesa", "professor", "second");
		process(mg);
	}
	
//	public static void process(Employee emp) {
//		System.out.println(emp.toString());
//		System.out.println(emp.pay());
//	}
//	
//	public static void process(Manager mg) {
//		System.out.println(mg.toString());
//		System.out.println(mg.display());
//	}
	
	public static void process(Object obj) { // 업캐스팅
		System.out.println(obj.toString());
		if(obj instanceof Employee) {
			Employee em = (Employee) obj; // 다운캐스팅
			System.out.println(em.pay());
		}else if (obj instanceof Manager) {
			Manager mg = (Manager) obj; // 다운캐스팅
			System.out.println(mg.display());
		}
	}

}
