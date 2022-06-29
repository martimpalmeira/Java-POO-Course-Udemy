package exercises.secao14.practice148.application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao14.practice148.entities.Employee;
import exercises.secao14.practice148.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= numberOfEmployees; i++) {

			System.out.println("Employee #" + i + " data:");

			System.out.print("Outsourced (y/n)? ");
			char isOut = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Hours: ");
			int hours = sc.nextInt();
			sc.nextLine();

			System.out.print("Vale per hours: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();

			if (isOut == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee outEmp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				addEmployee(employees, outEmp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				addEmployee(employees, emp);
			}

		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : employees) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}

	}

	public static void addEmployee(ArrayList<Employee> employees, Employee employee) {
		employees.add(employee);
	}

	public static void removeEmployee(ArrayList<Employee> employees, Employee employee) {
		employees.remove(employee);
	}

}
