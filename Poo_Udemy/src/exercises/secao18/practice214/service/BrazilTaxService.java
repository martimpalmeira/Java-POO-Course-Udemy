package exercises.secao18.practice214.service;

public class BrazilTaxService implements TaxService {
	
	public Double tax(Double amount) {
		if(amount > 100.00) {
			return amount * 0.15;
		}else {
			return amount * 0.20;
		}
	}
}
