package exercises.secao20.practice250.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import exercises.secao20.practice250.model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		// /Users/junior/Desktop/Arquivos Java/products.csv
		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] lineSplit = line.split(";");
				products.add(new Product(lineSplit[0], Double.parseDouble(lineSplit[1])));
				line = br.readLine();
			}

			double str = products.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / products.size();

			System.out.println("Average price: " + df.format(str));
			
			Comparator<String> comp = (s1,s2)-> s1.compareToIgnoreCase(s2);

			List<String> names = products.stream().filter(p -> p.getPrice() <= str).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
