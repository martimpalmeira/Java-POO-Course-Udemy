package exercises.secao18.practice219.model.services;

import java.time.LocalDate;
import java.util.ArrayList;

public class InstallmentService implements PaymentService  {

	public InstallmentService() {

	}

	public ArrayList<LocalDate> getInstallmentsDates(LocalDate initial, Integer numberOfIntsallments) {

		ArrayList<LocalDate> dates = new ArrayList<>();

		for (int i = 1; i <= numberOfIntsallments; i++) {
			LocalDate newDate = initial.plusMonths(i);
			dates.add(newDate);
		}

		return dates;
	}

	public  ArrayList<Double> getQuotas(Double totalValue, Integer numberOfinstallments, double monthInterest,
			double paymentFee) {
		ArrayList<Double> installments = new ArrayList<>();
		Double basicInstallment = totalValue / numberOfinstallments;
		for (int i = 1; i <= numberOfinstallments; i++) {
			Double simpleInstallment = basicInstallment + (basicInstallment * monthInterest * i);
			Double finalInstallment = simpleInstallment * (1 + paymentFee);
			installments.add(finalInstallment);
		}
		return installments;
	}

}
