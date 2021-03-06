package exercises.secao20.practice245.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import exercises.secao20.practice245.model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> products = new ArrayList<>();

		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));

		// products.forEach(Product::staticProductConsumer);
		// products.forEach(Product::nonStaticProductConsumer);
//		Consumer<Product> con = new Consumer<Product>(){
//
//			@Override
//			public void accept(Product p) {
//				p.setPrice(p.getPrice()*1.1);
//			}
//			
//		};

		// Consumer<Product> con = p -> p.setPrice(p.getPrice()*1.1);

		// products.forEach(p -> p.setPrice(p.getPrice()*1.1));

		products.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		products.forEach(System.out::println);
	}

}
