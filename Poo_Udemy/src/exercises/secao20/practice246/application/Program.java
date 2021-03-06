package exercises.secao20.practice246.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import exercises.secao20.practice246.model.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> products = new ArrayList<>();

		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));

		List<String> productsUpper = new ArrayList<>();

//		productsUpper = products.stream().map(new UpperCaseName()).collect(Collectors.toList());
//
//		productsUpper = products.stream().map(Product::staticFunction).collect(Collectors.toList());
//
//		productsUpper = products.stream().map(Product::nonStaticFunction).collect(Collectors.toList());

		productsUpper = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		productsUpper.forEach(System.out::println);
	}

}
