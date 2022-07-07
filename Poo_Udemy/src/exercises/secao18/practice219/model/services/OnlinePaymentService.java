package exercises.secao18.practice219.model.services;

public interface OnlinePaymentService {

	public Double monthInterest(Double amount, Integer months);
	
	public Double paymentFee(Double amount);
}
