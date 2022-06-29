package exercises.secao14.practice152.entities;

public class IndividualTaxPayer extends TaxPayer {

	private Double healthExpenditures;

	public IndividualTaxPayer() {
		super();
	}

	public IndividualTaxPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double paidTax() {
		if (this.anualIncome < 20000.00) {
			return this.anualIncome * 0.15 - (this.healthExpenditures * 0.5);
		} else {
			return this.anualIncome * 0.25 - (this.healthExpenditures * 0.5);
		}

	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
