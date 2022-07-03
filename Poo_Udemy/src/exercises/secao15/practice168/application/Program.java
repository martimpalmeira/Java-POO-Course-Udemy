package exercises.secao15.practice168.application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao15.practice168.model.entities.Account;
import exercises.secao15.practice168.model.exception.AccountException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("Holder: ");
		String holder = sc.nextLine();

		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		sc.nextLine();

		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		sc.nextLine();

		Account ac = new Account(accountNumber, holder, initialBalance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double withdrawAmount = sc.nextDouble();
		sc.nextLine();

		try {
			ac.withdraw(withdrawAmount);

			System.out.print("New balance: " + df.format(ac.getBalance()));
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
