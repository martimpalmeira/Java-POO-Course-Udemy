package exercises.secao18.practice219.model.services;

public class PaypalPaymentService implements OnlinePaymentService  {
	
	private static final Double MONTH_INTEREST = 0.01;
	
	private static final Double PAYMENT_FEE = 0.02;
	
	public PaypalPaymentService() {
	}
	
	@Override
	public Double monthInterest(Double amount, Integer month) {
		return amount * MONTH_INTEREST * month;
	}
	
	@Override
	public Double paymentFee(Double amount) {
		return amount * PAYMENT_FEE;
	}	


	
	
}
