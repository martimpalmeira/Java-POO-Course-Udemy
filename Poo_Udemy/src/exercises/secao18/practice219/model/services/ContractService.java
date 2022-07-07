package exercises.secao18.practice219.model.services;

import java.time.LocalDate;

import exercises.secao18.practice219.model.entities.Contract;
import exercises.secao18.practice219.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService() {

	}

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public OnlinePaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {

		LocalDate date = contract.getDate();
		Double totalValue = contract.getTotalValue();
		Double amount;
		LocalDate dueDate;

		for (int i = 1; i <= months; i++) {		
			dueDate = date.plusMonths(i);
			amount = totalValue / months;
			amount += paymentService.monthInterest(amount, i);
			amount +=  paymentService.paymentFee(amount);
			Installment inst = new Installment(dueDate, amount);
			contract.addInstallment(inst);		
		}
	}

}
