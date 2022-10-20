package java08_static_access.part07;

public class Java56 {

	public static void main(String[] args) {

		MemberDAO mb = MemberDAO.getInstance();
		mb.display();
		
		MemberDAO mc = MemberDAO.getInstance();
		mc.display();

	}

}
