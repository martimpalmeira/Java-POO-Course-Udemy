package exercises.secao20.practice244.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import exercises.secao20.practice244.model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> products = new ArrayList<>();

		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));

		products.removeIf(p -> p.getPrice() >= 100.00);

		for (Product p : products) {
			System.out.println(p);
		}

	}
}
