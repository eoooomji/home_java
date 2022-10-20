package java07_class.part06;

public class CountVarg {
	void addValue(double... arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	} // end addValue()

	void sumValue(String name, int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.printf("name=%s sum=%d \n", name, sum);
	}
}
