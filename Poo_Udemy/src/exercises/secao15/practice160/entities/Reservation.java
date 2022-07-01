package exercises.secao15.practice160.entities;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class Reservation {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private int roomNumber;

	private Date checkin;

	private Date checkout;

	

	public Reservation(int roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date d) {
		this.checkout = d;
	}

	public Integer duration() {
		long checkoutDate = this.checkout.getTime();
		long checkinDate = this.checkin.getTime();
		long duration = checkoutDate - checkinDate;
		Integer durationDays = (int)TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
		return durationDays;
	}

	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "Reservation: Room " + this.roomNumber + ", check-in: " + sdf.format(this.checkin) + ", check-out: "
				+ sdf.format(checkout) + ", " + this.duration() + " nights";
	}
}