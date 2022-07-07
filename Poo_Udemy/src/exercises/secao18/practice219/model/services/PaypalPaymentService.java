package exercises.secao18.practice219.model.services;

import java.util.ArrayList;

public class PaypalPaymentService  {
	
	private static final double MONTH_INTEREST = 0.01;
	
	private static final double PAYMENT_FEE = 0.02;
	
	public PaypalPaymentService() {
		
	}
	
	public double getMONTH_INTEREST() {
		return MONTH_INTEREST;
	}

	public double getPAYMENT_FEE() {
		return PAYMENT_FEE;
	}	

	public ArrayList<Double> getQuotas(Double totalValue, Integer numberOfinstallments) {
		InstallmentService i = new InstallmentService();
		 return i.getQuotas(totalValue, numberOfinstallments, MONTH_INTEREST, PAYMENT_FEE);
	}
	
	
}
