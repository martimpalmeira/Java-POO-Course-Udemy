package exercises.secao20.practice245.model.entities;

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

	public static boolean productPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}

	public static void staticProductConsumer(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonStaticProductConsumer() {
		price *= 1.1;
	}

}
