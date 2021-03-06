package exercises.secao20.practice247.application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import exercises.secao20.practice247.model.entities.Product;
import exercises.secao20.practice247.model.service.SumProductsT;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		DecimalFormat df = new DecimalFormat("0.00");

		Locale.setDefault(Locale.US);

		List<Product> products = new ArrayList<>();

		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));

		System.out.println("Sum = "
				+ df.format(SumProductsT.filteredSum(products, p -> p.getName().toUpperCase().charAt(0) == 'M')));

	}

}
