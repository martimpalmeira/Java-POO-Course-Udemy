package exercises.secao14.practice149.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao14.practice149.entities.ImportedProduct;
import exercises.secao14.practice149.entities.Product;
import exercises.secao14.practice149.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		ArrayList<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numberOfProducts; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();

			if (type == 'c') {
				products.add(new Product(name, price));
			} else if (type == 'u') {
				System.out.print("Manufacture date(DD/MM/YYYY): ");
				products.add(new UsedProduct(name, price, sdf.parse(sc.nextLine())));

			} else if (type == 'i') {
				System.out.print("Customs fee: ");
				products.add(new ImportedProduct(name, price, sc.nextDouble()));
				sc.nextLine();
			}

		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
	}
}
