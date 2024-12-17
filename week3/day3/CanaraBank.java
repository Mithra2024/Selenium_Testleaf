package week3.day3;


public class CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
	System.out.println("Cashondelivery by cb");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI payments by CB");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Card payments by CB");
		
	}

	@Override
	public void internetBanking() {
	System.out.println("Internet banking by CB");
	}
	
	public void recordPaymentDetails() {
		System.out.println("Record the payments");
		
	}

	public static void main(String[] args) {
		CanaraBank cb=new CanaraBank();
		cb.cashOnDelivery();
		cb.upiPayments();
		cb.cardPayments();
		cb.internetBanking();
		cb.recordPaymentDetails();
	}
	}
	

