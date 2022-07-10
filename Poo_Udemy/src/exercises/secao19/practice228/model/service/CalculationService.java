package exercises.secao19.practice228.model.service;

import java.util.ArrayList;

import exercises.secao19.practice228.model.entities.Product;

public class CalculationService {

	public Product max(ArrayList<Product> list) {
		Product maxP = list.get(0);
		for (Product p : list) {
			if (maxP.getValue() < p.getValue()) {
				maxP = p;
			}
		}return maxP;
	}
}