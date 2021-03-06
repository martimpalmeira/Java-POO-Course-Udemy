package exercises.secao15.practice160.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exercises.secao15.practice160.exception.DateException;

public class Reservation {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private int roomNumber;

	private Date checkin;

	private Date checkout;

	

	public Reservation(int roomNumber, Date checkin, Date checkout) throws DateException {
		if(checkout.after(checkin)) {
			this.roomNumber = roomNumber;
			this.checkin = checkin;
			this.checkout = checkout;
		}else {
			throw new DateException("Check-oute date must be after check-in date");
		}
		
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

	public Date getCheckout() {
		return checkout;
	}

	public Integer duration() {
		long checkoutDate = this.checkout.getTime();
		long checkinDate = this.checkin.getTime();
		long duration = checkoutDate - checkinDate;
		Integer durationDays = (int)TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
		return durationDays;
	}

	public void updateDates(Date checkin, Date checkout) throws DateException {
		Date now = new Date();
		if(checkin.after(now) || checkout.after(now)) {
			throw new DateException("Reservation dates for update must be future dates");
		}
		if(checkout.after(checkin)) {
			this.checkin = checkin;
			this.checkout = checkout;
		}else {
			throw new DateException("Check-oute date must be after check-in date");
		}
		
	}

	@Override
	public String toString() {
		return "Reservation: Room " + this.roomNumber + ", check-in: " + sdf.format(this.checkin) + ", check-out: "
				+ sdf.format(checkout) + ", " + this.duration() + " nights";
	}
}
