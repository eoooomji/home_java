package java01_basic;

public class Java004 {

	public static void main(String[] args) {
		int numX = 10;
		int numY = 5;

		int res = numX + numY;
		System.out.println(res); // 15

		double avg = 4.5;
		double val = numX + avg;
		System.out.println(val); // 14.5

		short a = 3;
		short b = 4;

		int c = a + b;
		System.out.println(c);

		char data = '0'; // 48
		char alpa = 'A'; // 65
		int sum = data + alpa;
		System.out.println(sum); // 113

		int q = 10;
		int p = 3;
		System.out.println(q / p); // int/int = 3
		System.out.println((double) q / p); // 3.333333...
		// q값이 double타입으로 바뀐 후 10.0이 되고 그 뒤에 연산자가 진행된다.
		System.out.println((double) (q / p)); // 3.0
		// (q/p)가 이루어지고 그 값이 double타입으로 출력된다.

		int aa = 3;
		int bb = 4;
		System.out.println(a + b); // 산술연산자
		System.out.println(a + "는(은) 3입니다."); // 문자열 연결
		System.out.println("a=" + a); // 문자열 연결
		System.out.println("결과=" + a + b); // 문자열 연결. 결과 = 34
		System.out.println("결과=" + (a + b)); // 결과 = 7

		int x = 3;
		++x; // x = x + 1, x += 1
		System.out.println(x); // 4
		--x; // x = x - 1, x -= 1
		System.out.println(x); // 3

		int y = 5;
		y++;
		System.out.println(y); // 6
		y--;
		System.out.println(y); // 5

		// 10++;
		// 사용 불가

		final int Num = 4;
		// Num++;
		// 사용 불가

		int i = 5;
		int j = 0;
		j = ++i;
		System.out.println(j); // 6
		i = 5;
		j = 0;
		j = i++;
		System.out.println(j); // 5

		int xx = 3;
		int yy = 6;
		int zz = 3;
		boolean result;
		result = xx < yy && xx == zz;
		System.out.println(result); // true

		result = xx > yy || xx == zz;
		System.out.println(result); // true

		xx = 3;
		yy = 5;
		zz = 7;
		result = (++xx > yy) && (++yy < zz);
		System.out.printf("xx=%d, yy=%d, zz=%d result=%b \n", xx, yy, zz, result); // xx=4, yy=5, zz=7 result=false
		// && 연산자의 좌변이 false이면 우변은 수행하지 않는다.
		xx = 4;
		yy = 8;
		zz = 10;
		result = (zz > ++yy) || (++xx > yy);
		System.out.printf("xx=%d, yy=%d, zz=%d result=%b \n", xx, yy, zz, result); // xx=4, yy=9, zz=10 result=true
		// || 연산자의 좌변이 true이면 우변은 수행하지 않는다.
		// || 연산자의 좌변이 false이고 우변이 true이면 둘다 수행한다.

		int k = 1;
		int m = 2;
		int n = 3;
		result = k == 2 && m == 2 || n == 3;
		System.out.printf("k=%d, m=%d, n=%d, result=%b \n", k, m, n, result);
		// k=1, m=2, n=3, result=true
		result = --k == 2 || m-- == 1 && n == 3;
		System.out.printf("k=%d, m=%d, n=%d, result=%b \n", k, m, n, result);
		// k=0, m=1, n=3, result=false

		int total = 23;
		int record = 5;
		int re = total % record == 0 ? total / record : total / record + 1;
		System.out.println(re); // 5

		int ab = 3;
		int an = 0;
		an = 3 + 2;
		System.out.println(an); //5 
		ab += 1;
		System.out.println(ab); // 4
		ab -= 1;
		System.out.println(ab); // 3
		ab *= 1;
		System.out.println(ab); // 3

	}

}
