package exercises.secao20.practice241.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import exercises.secao20.practice241.model.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		products.add(new Product("TV", 900.00));
		products.add(new Product("Notebook", 1200.00));
		products.add(new Product("Tablet", 450.00));
		
		 
		products.sort((p1, p2) ->  p1.getName().compareToIgnoreCase(p2.getName()));

		for (Product p : products) {
			System.out.println(p);
		}
	}

}
