package exercises.secao13.practice136.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao13.practice136.entities.Department;
import exercises.secao13.practice136.entities.HourContract;
import exercises.secao13.practice136.entities.Worker;
import exercises.secao13.practice136.entities.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter departments's name: ");
		Department department = new Department(sc.nextLine());
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many contracts to this worker? ");
		Integer numberOfContracts = sc.nextInt();
		sc.nextLine();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, department);

		for (int i = 1; i <= numberOfContracts; i++) {
			System.out.println("Enter contract #" + i + " data: ");

			System.out.print("Date (DD/M/YYYY): ");
			String contractDate = sc.nextLine();
			Date date = sdf1.parse(contractDate);

			System.out.print("Vale per hour: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();

			System.out.print("Duration (hours): ");
			Integer duration = sc.nextInt();
			sc.nextLine();

			HourContract contract = new HourContract(date, valuePerHour, duration);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthYear = sc.nextLine();

		String[] date = monthYear.split("/");
		String month = date[0];
		String year = date[1];
		Double income = worker.income(Integer.valueOf(year), Integer.valueOf(month));

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthYear + ": " + income);

		sc.close();
		
		
	}
}
