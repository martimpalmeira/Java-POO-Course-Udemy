package exercises.secao14.practice152.entities;

public class CompanyTaxPayer extends TaxPayer {

	private Integer numberOfEmployees;

	public CompanyTaxPayer() {
		super();
	}

	public CompanyTaxPayer(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double paidTax() {
		if(this.numberOfEmployees<=10) {
			return this.anualIncome * 0.16;
		}else {
			return this.anualIncome * 0.14;
		}
	
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
