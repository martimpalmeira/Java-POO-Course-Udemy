package exercises.secao14.practice149.entities;

import java.text.DecimalFormat;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return this.name + " $ " + (this.price + this.customsFee) + " " + "(Customs fee: $ " + df.format(this.customsFee)
				+ ")";
	}

	public Double totalPrice() {
		return this.price += this.customsFee;
	}
}
