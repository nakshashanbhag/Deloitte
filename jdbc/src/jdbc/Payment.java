package jdbc;

public class Payment {
	static Payment payment = new Payment();
	
	//step1 : making Constructor private
	
	private Payment() {
		System.out.println("Object of Payment created.");
	}
	
	
	//to get object of Payment
	public static Payment getPaymentObj()
	{
		return payment;
	}
	
	
	//to get amount paid by client
	public void pay(int amount)
	{
		System.out.println("payment done for Rs: "+amount);
	}

}
