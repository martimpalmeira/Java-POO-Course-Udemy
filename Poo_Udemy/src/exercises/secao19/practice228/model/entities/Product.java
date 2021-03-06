package exercises.secao19.practice228.model.entities;

import java.text.DecimalFormat;

public class Product implements Comparable<Product> {

	private String name;

	private Double value;
	
	private static DecimalFormat df = new DecimalFormat("0.00");

	public Product() {

	}

	public Product(String name, Double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return name + ", " + df.format(value);
	}

	@Override
	public int compareTo(Product other) {
		return this.value.compareTo(other.getValue());
	}

}
