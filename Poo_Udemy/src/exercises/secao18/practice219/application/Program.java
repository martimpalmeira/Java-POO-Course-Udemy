package exercises.secao18.practice219.application;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao18.practice219.model.entities.Contract;
import exercises.secao18.practice219.model.services.InstallmentService;
import exercises.secao18.practice219.model.services.PaypalPaymentService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date(dd/MM/yyyy): ");
		LocalDate date = LocalDate.from(dtf.parse(sc.nextLine()));
		System.out.print("Contract value: ");
		Double value = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter number of installments: ");
		int numberOfIntallments = sc.nextInt();
		sc.nextLine();

		Contract c = new Contract(number, date, value);

		PaypalPaymentService p = new PaypalPaymentService();
		InstallmentService iServ = new InstallmentService();

		ArrayList<Double> quotas = p.getQuotas(c.getTotalValue(), numberOfIntallments);
		ArrayList<LocalDate> dates = iServ.getInstallmentsDates(c.getDate(), numberOfIntallments);

		System.out.println("Installments: ");
		for (int i = 0; i < numberOfIntallments; i++) {
			System.out.println(dtf.format(dates.get(i)) + " - " + df.format(quotas.get(i)));
		}

		sc.close();
	}

}
