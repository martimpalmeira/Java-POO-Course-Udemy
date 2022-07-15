package exercises.secao20.practice247.model.service;

import java.util.List;
import java.util.function.Predicate;

import exercises.secao20.practice247.model.entities.Product;

public class SumProductsT {

	public static Double filteredSum(List<Product> list, Predicate<Product> criteria) {
		Double sum = 0.00;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}return sum;
	}

}
