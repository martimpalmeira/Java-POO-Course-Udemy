package exercises.secao19.practice228.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import exercises.secao19.practice228.model.entities.Product;
import exercises.secao19.practice228.model.service.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String path = "/Users/junior/Desktop/products.csv";
		ArrayList<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			
			

			while (line != null) {
				
				String[] lineSplit = line.split(";");
				
				products.add(new Product(lineSplit[0], Double.parseDouble(lineSplit[1])));
				
				line = br.readLine();
				
			}
			
			
			System.out.println("Most expensive:");
			System.out.println(CalculationService.max(products));

		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
