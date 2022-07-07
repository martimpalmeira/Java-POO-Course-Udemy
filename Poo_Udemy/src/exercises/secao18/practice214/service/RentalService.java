package exercises.secao18.practice214.service;

import exercises.secao18.practice214.entities.CarRental;
import exercises.secao18.practice214.entities.Invoice;

public class RentalService {

	private Double priceperHour;

	private Double pricePerDay;

	private TaxService taxService;

	public RentalService() {

	}

	public RentalService(Double priceperHour, Double pricePerDay, TaxService taxService) {
		this.priceperHour = priceperHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPriceperHour() {
		return priceperHour;
	}

	public void setPriceperHour(Double priceperHour) {
		this.priceperHour = priceperHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setBrazilTaxService(BrazilTaxService brazilTaxService) {
		this.taxService = brazilTaxService;
	}

	public void processInvoice(CarRental carRental) {
		long finish = carRental.getFinish().getTime();
		long start = carRental.getStart().getTime();
		double diference = (double)(finish - start) / 1000 / 60 / 60;

		double basicPayment;

		if (diference <= 12) {
			basicPayment = this.priceperHour * Math.ceil(diference);
		} else {
			basicPayment = this.pricePerDay * Math.ceil(diference / 24);
		}

		double tax;

		tax = this.taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
