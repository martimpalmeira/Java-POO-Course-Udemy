package exercises.secao14.practice152.entities;

import java.text.DecimalFormat;

public abstract class TaxPayer {
	
	protected static DecimalFormat df = new DecimalFormat("0.00");
	
	protected String name;
	
	protected Double anualIncome;

	public TaxPayer() {

	}

	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double paidTax();
	
	@Override
	public String toString() {
		return this.name + ": $ " + df.format(paidTax());
	}
	
	
	
	
}
