package exercises.secao18.practice219.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
	
	private Integer number;
	
	private LocalDate date;
	
	private Double totalValue;
	
	private ArrayList<Installment> intallments = new ArrayList<>();

	
	public Contract() {
		
	}

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public ArrayList<Installment> getInstallment() {
		return this.intallments;
	}
	
	public void addInstallment(Installment i) {
		this.intallments.add(i);
	}
	
	public void removeInstallment(Installment i) {
		this.intallments.remove(i);
	}
	
	
	
	
	
	
	
}
