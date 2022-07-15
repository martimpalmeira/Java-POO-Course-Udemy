package exercises.secao20.practice246.model.entities;

import java.text.DecimalFormat;

public class Product {

	private static DecimalFormat df = new DecimalFormat("0.00");

	private String name;

	private Double price;

	public Product() {

	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + df.format(price) + "]";
	}

	public static String staticFunction(Product p) {
		return p.getName().toUpperCase();
	}

	public String nonStaticFunction() {
		return name.toUpperCase();
	}
}
