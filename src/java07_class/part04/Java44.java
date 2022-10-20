package java07_class.part04;

/*
 * [출력결과]
 * 기업은행 42523-52325 100000
 * 하나은행 52253-22623 153000
 * 신한은행 16239-95235 256000
 * 총납입액 : 509000
 */
public class Java44 {

	public static void main(String[] args) {
		CreditCard[] card = new CreditCard[3];
		card[0] = new CreditCard("기업은행", "42523-52325", 100000);
		card[1] = new CreditCard("하나은행", "52253-22623", 153000);
		card[2] = new CreditCard("신한은행", "16239-95235", 256000);
		
		totalPay(process(card));
	} // end main()

	public static int process(CreditCard[] card) {
		int sum = 0;
		for (int i = 0; i < card.length; i++) {
			sum += card[i].pay;
		}
		return sum;
	} // end process()

	public static void totalPay(int sum) {
		System.out.printf("총납입액 : %d", sum);
	} // end totalPay()
} // end class
