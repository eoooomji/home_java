package java03_array;

public class Java012 {

	public static void main(String[] args) {
		int[] num = new int[] { 22, 3, 8, 12 };
		int odd = 0; // 홀수
		int even = 0; // 짝수

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even += num[i];
			} else {
				odd += num[i];
			}
		}
		System.out.printf("홀수 : %d \n", odd);
		System.out.printf("짝수 : %d", even);

		System.out.println("========================");
		
		int[] data1 = new int[3]; // 0 기본값
		long[] data2 = new long[3]; // 0L 기본값
		float[] data3 = new float[3]; // 0.0F 기본값
		double[] data4 = new double[3]; // 0.0 기본값
		char[] data5 = new char[3]; // \u0000 기본값(유니코드)
		boolean[] data6 = new boolean[3]; // false 기본값
		String[] data7 = new String[3]; // null 기본값
		
		for (int i = 0 ; i< data7.length ; i++) {
			System.out.printf("data[%d] = %s \n", i , data7[i]);
		}
		
		System.out.println("========================");
		
		char[] data = new char[] {'a','b','F','R','a'};
		int cnt = 0; // 대문자 갯수를 저장하기 위한 변수
		
		for(int i = 0; i < data.length; i++) {
			if(data[i]>='A' && data[i] <='Z') {
				cnt++;
			}
		}
		System.out.printf("대문자 갯수 : %d",cnt);
		
	} // end main()

} // end class
