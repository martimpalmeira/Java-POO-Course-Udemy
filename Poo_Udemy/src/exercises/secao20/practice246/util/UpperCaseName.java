package exercises.secao20.practice246.util;

import java.util.function.Function;

import exercises.secao20.practice246.model.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
	
	
}
