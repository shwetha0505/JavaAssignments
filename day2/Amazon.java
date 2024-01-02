package week3.day2;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash On Delivery option available");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Credit/Debit Card");
		
	}

	@Override
	public void internetBanking() {
	System.out.println("NetBAnking");
		
	}
	public static void main(String[] args) {
		Amazon am =new Amazon();
		am.cardPayments();
		am.cashOnDelivery();
		am.internetBanking();
		am.recordPaymentDetails();
		am.upiPayments();
		
	}

}
