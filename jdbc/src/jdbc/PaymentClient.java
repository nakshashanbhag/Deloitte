package jdbc;

public class PaymentClient {
	public static void main(String[] args) {
		
	
	Payment payment1 = Payment.getPaymentObj();
	Payment payment2 = Payment.getPaymentObj();
	Payment payment3 = Payment.getPaymentObj();
	
	payment1.pay(1000);
	payment2.pay(500);
	payment3.pay(5000);
	}
	
}
