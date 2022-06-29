package exercises.secao14.practice152.application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao14.practice152.entities.CompanyTaxPayer;
import exercises.secao14.practice152.entities.IndividualTaxPayer;
import exercises.secao14.practice152.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		ArrayList<TaxPayer> taxPayers = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxPayers = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= numberOfTaxPayers; i++) {
			System.out.println("Tax Payer #" + i + " data:");

			System.out.print("Individual or company (i/c)? ");
			char indOrComp = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Anal income: ");
			Double anualIncome = sc.nextDouble();
			sc.nextLine();

			if (indOrComp == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpend = sc.nextDouble();
				sc.nextLine();
				taxPayers.add(new IndividualTaxPayer(name, anualIncome, healthExpend));
			} else if (indOrComp == 'c') {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				sc.nextLine();
				taxPayers.add(new CompanyTaxPayer(name, anualIncome, numberOfEmployees));
			}

		}

		System.out.println();
		System.out.println("TAXES PAID:");
		Double totalTaxes = 0.00;
		for (TaxPayer t : taxPayers) {
			System.out.println(t);
			totalTaxes += t.paidTax();
		}

		System.out.println();
		System.out.print("TOTAL TAXES: $ " + df.format(totalTaxes));

		sc.close();
	}
}
