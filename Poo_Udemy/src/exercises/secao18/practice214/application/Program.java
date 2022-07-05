package exercises.secao18.practice214.application;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao18.practice214.entities.Location;

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
		Date pickupDate = sdf.parse(sc.nextLine());

		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		Date returnDate = sdf.parse(sc.nextLine());

		System.out.print("Enter price per hour: ");
		Double valuePerHour = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter price per day: ");
		Double valuePerDay = sc.nextDouble();
		sc.nextLine();

		Location location = new Location(carModel, pickupDate, returnDate, valuePerHour, valuePerDay);
		
		System.out.println("INVOICE: ");
		System.out.println("Basic payment: " + df.format(location.locationValue()));
		System.out.println("Tax: " + df.format(location.tax()));
		System.out.print("Total payment: " + df.format(location.total()));

		sc.close();
	}

}