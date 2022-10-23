package java15_exception;

import java.io.IOException;

public class Qawa {

	public static void main(String[] args) throws IOException {
		while(true) {
			int ch = System.in.read();
			System.out.print(ch);
		}
	}

}
