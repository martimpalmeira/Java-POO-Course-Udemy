package exercises.secao18.practice214.application;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao18.practice214.entities.CarRental;
import exercises.secao18.practice214.entities.Vehicle;
import exercises.secao18.practice214.service.BrazilTaxService;
import exercises.secao18.practice214.service.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		Date finish = sdf.parse(sc.nextLine());

		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: ");
		Double pricePerHour = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter price per day: ");
		Double pricePerDay = sc.nextDouble();
		sc.nextLine();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(carRental);

		System.out.println("INVOICE: ");
		System.out.println("Basic payment: " + df.format(carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + df.format(carRental.getInvoice().getTax()));
		System.out.print("Total payment: " + df.format(carRental.getInvoice().getTotalPayment()));

		sc.close();
	}

}
