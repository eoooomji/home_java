package java02_statements;

public class Java008 {

	public static void main(String[] args) {

		int data = 1;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.printf("%4d", data++);
			}
			System.out.println();
		}

		System.out.println("===================");

		int data1 = 0;
		label: for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.printf("%4d", ++data1);
				if (data % 4 == 0) {
					System.out.println();
					continue label;
				}
			}
			System.out.println();
		}

		System.out.println("===================");

		for (int row = 0; row <= 3; row++) {
			for (int col = 1; col <= 5; col++) {
				System.out.printf("%4d", col);
			}
			System.out.println();
		}

		System.out.println("===================");
		move: for (int k = 1; k < 5; k++) {
			go: for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 2; j++) {
					// break move;
					// continue move;

					// break go;
					// continue go;
					break;
				}
				System.out.printf("i=%d \n", i);
			}
			System.out.println("kkk");
		}
		System.out.println("program end");

		System.out.println("===================");
		
//		int qwe = 1;
//		while(qwe <=5) {
//			System.out.println(qwe);
//			qwe++;
//		}
		
//		int qwe = 1;
//		while(qwe <= 5) {
//			System.out.println(qwe++);
//		}
		
		int qwe = 0;
		while(++qwe <= 5) {
			System.out.println(qwe);
		}
		
		System.out.println("===================");
		
		int cnt = 1;
		while(true) {
			System.out.println(cnt++);
			if(cnt == 6){
				break;
			}
		}
		
		System.out.println("===================");
		
		char chk = 'y';
		do {
			System.out.println("주문하시겠습니까? ( y / n )");
		}while(chk == 'n');
		
	} // end main()

} // end class
