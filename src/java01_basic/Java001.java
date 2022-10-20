package java01_basic;

public class Java001 {

	public static void main(String[] args) {
		// ���� ����
		int data; // ������Ÿ�� ������;

		// �� �Ҵ�
		data = 3; // data������ 3���� �Ҵ�(����)

		System.out.println(data); // 3

		// data������ ���ο� �� �Ҵ�
		data = 10;
		System.out.println(data); // 10

		double avg = 4; // 4.0
		System.out.println(avg);
		// int num = 4.0;
		// Type mismatch: cannot convert from double to int
		// long ko = 4.0F;
		// Type mismatch: cannot convert from float to long

		int x = 0101;
		System.out.println(x); // 65 8���� 

		int y = 65;
		System.out.println(y); // 65 10����

		int z = 0B101;
		System.out.println(z); // 5 2����
		
		int k = 0x101;
		System.out.println(k); // 257 26����

	}

}
