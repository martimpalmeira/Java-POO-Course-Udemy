package exercises.secao18.practice214.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Location {

	private String carModel;

	private Date initialInstant;

	private Date finalInstant;

	private Double hourValue;

	private Double dailyValue;

	public Location() {

	}

	public Location(String carModel, Date initialInstant, Date finalInstant, Double hourValue, Double dailyValue) {
		this.carModel = carModel;
		this.initialInstant = initialInstant;
		this.finalInstant = finalInstant;
		this.hourValue = hourValue;
		this.dailyValue = dailyValue;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Date getInitialInstant() {
		return initialInstant;
	}

	public void setInitialInstant(Date initialInstant) {
		this.initialInstant = initialInstant;
	}

	public Date getFinalInstant() {
		return finalInstant;
	}

	public void setFinalInstant(Date finalInstant) {
		this.finalInstant = finalInstant;
	}

	public Double getHourValue() {
		return hourValue;
	}

	public void setHourValue(Double hourValue) {
		this.hourValue = hourValue;
	}

	public Double getDailyValue() {
		return dailyValue;
	}

	public void setDailyValue(Double dailyValue) {
		this.dailyValue = dailyValue;
	}

	public Integer duration() {
		Long initialDateMili = this.initialInstant.getTime();
		Long finalDateMili = this.finalInstant.getTime();
		Long durationMili = finalDateMili - initialDateMili;
		Integer durationMinutes = (int)TimeUnit.MINUTES.convert(durationMili, TimeUnit.MILLISECONDS);
		return (int)Math.ceil(durationMinutes/60.0);
	}

	public Double locationValue() {
		if (duration() <= 12) {
			return this.hourValue * duration();
		} else {
			int days = (int)Math.ceil(duration()/24.0);
			return this.dailyValue * days;
		}
	}

	public Double tax() {
		if (locationValue() <= 100.00) {
			return locationValue() * 0.20;
		} else {
			return locationValue() * 0.15;
		}
	}
	
	public Double total() {
		return locationValue() + tax();
	}

}
