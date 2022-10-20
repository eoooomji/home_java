package java12_api;

/*
 * [출력결과]
 * ip:127.0.0.1
 * port:8080
 */
public class Java83 {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8000";

		String[] arr = sn.split(":");
		System.out.println("ip:" + arr[0]);
		System.out.println("port:" + arr[1]);

		System.out.println("====================");

		int index = sn.indexOf(":"); // int index = 4;
		System.out.println("ip:" + sn.substring(0, index));
		System.out.println("port:" + sn.substring(index + 1));

	}

}
