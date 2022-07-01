package exercises.secao15.practice160.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercises.secao15.practice160.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		Integer roomNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		String checkinDateStr = sc.nextLine();
		Date checkinDate = sdf.parse(checkinDateStr);
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		String checkoutDateStr = sc.nextLine();
		Date checkoutDate = sdf.parse(checkoutDateStr);
		
		Reservation r = new Reservation(roomNumber, checkinDate, checkoutDate);
		
		System.out.println(r);
		
		System.out.println();
		System.out.println("Enter data to update the reservation: ");
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		String newCheckinDateStr = sc.nextLine();
		Date newCheckinDate = sdf.parse(newCheckinDateStr);
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		String newCheckoutDateStr = sc.nextLine();
		Date newCheckoutDate = sdf.parse(newCheckoutDateStr);
		
		r.updateDates(newCheckinDate, newCheckoutDate);
		System.out.print(r);
		
		
		
		
		
		
		
		
	}
}
