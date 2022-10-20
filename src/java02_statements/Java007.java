package java02_statements;

public class Java007 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println("===================");

		int sum = 0;
		int i;
		for (i = 1;; i++) {
			sum = sum + i;
			if (sum > 50) {
				break;
			}
		}
		System.out.printf("i = %d, sum = %d \n", i, sum);

		System.out.println("===================");

		int hap = 0;
		int j;

		for (j = 1;; j++) {
			hap += j;
			System.out.printf("j=%d, hap=%d \n", j, hap);
			if (hap >= 15) {
				break;
			}
		}

		System.out.println("===================");
		
		int s = 0;
		int k;

		for (k = 1;; k++) {
			s += k;
			System.out.printf("k= %d \n", k);
			if (s >= 15) {
				System.out.printf("s= %d \n", s);
				break;
			}
		}
		
		System.out.println("===================");

		for (int l = 1; l <= 10; l++) {
			s += l;
		}
		System.out.printf("s= %d \n", s);
		
		System.out.println("===================");
		
		int odd = 0; // (홀수)
		int even = 0; // (짝수)
		for(int p = 1 ; p <= 10; p++) {
			if(p % 2 == 0) {
				even += p;
			}else {
				odd += p;
			}		
		}
		System.out.printf("홀수누적 : %d \n", odd);
		System.out.printf("짝수누적 : %d \n", even);	
		
		System.out.println("===================");

		for (int y= 1; y<=10; y++) {
			if(y % 3 ==0) 
			continue;
		    System.out.println(y);
			
		}
		
	}

}
