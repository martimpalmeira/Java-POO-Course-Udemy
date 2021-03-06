package exercises.secao18.practice219.application;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import exercises.secao18.practice219.model.entities.Contract;
import exercises.secao18.practice219.model.entities.Installment;
import exercises.secao18.practice219.model.services.ContractService;
import exercises.secao18.practice219.model.services.PaypalPaymentService;

public class Program {

	public static void main(String[] args){

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

		ContractService iServ = new ContractService(new PaypalPaymentService());
		iServ.processContract(c, numberOfIntallments);

		System.out.println("Installments: ");
		for (Installment inst : c.getInstallment()) {
			System.out.println(dtf.format(inst.getDueDate()) + " - " + df.format(inst.getAmount()));
		}

		sc.close();
	}

}
