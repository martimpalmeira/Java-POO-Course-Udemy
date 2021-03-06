package exercises.secao20.practice251.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao20.practice251.model.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter full file path: ");
		// /Users/junior/Desktop/Arquivos Java/employees.csv
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] field = line.split(";");

				employees.add(new Employee(field[0], field[1], Double.parseDouble(field[2])));

				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();

			System.out.println("Email of people whose salary is more than " + df.format(salary));

			List<String> emails = employees.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail())
					.sorted((p, q) -> p.compareToIgnoreCase(q)).toList();

			emails.forEach(System.out::println);

			Double sum = employees.stream().filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
					.map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y);

			System.out.println("Sum of salary of people whose name starts with 'M': " + df.format(sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
