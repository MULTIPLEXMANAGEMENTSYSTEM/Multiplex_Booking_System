package com.MBS.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seats {
	@Id
	@Column(name = "BOOKINGID")
	private int bookingId;
	@Column(name = "SHOWID")
	private int showId;
	@Column(name = "USERID")
	private int userId;
	@Column(name = "TOTALSEATS")
	private int noOfSeats;
	@Column(name = "TOTALSEATSCANCELLED")
	private int noOfSeatsCancelled;
	@Column(name = "SeatCost")
	private float costOfSeats;
	@Column(name = "SEATTYPE")
	private String typesOfSeats;
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfSeatsCancelled() {
		return noOfSeatsCancelled;
	}

	public void setNoOfSeatsCancelled(int noOfSeatsCancelled) {
		this.noOfSeatsCancelled = noOfSeatsCancelled;
	}

	public float getCostOfSeats() {
		return costOfSeats;
	}

	public void setCostOfSeats(float costOfSeats) {
		this.costOfSeats = costOfSeats;
	}

	public String getTypesOfSeats() {
		return typesOfSeats;
	}

	public void setTypesOfSeats(String typesOfSeats) {
		this.typesOfSeats = typesOfSeats;
	}
	

	public Seats() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Seats(int bookingId, int showId, int userId, int noOfSeats, int noOfSeatsCancelled, float costOfSeats,
			String typesOfSeats) {
		super();
		this.bookingId = bookingId;
		this.showId = showId;
		this.userId = userId;
		this.noOfSeats = noOfSeats;
		this.noOfSeatsCancelled = noOfSeatsCancelled;
		this.costOfSeats = costOfSeats;
		this.typesOfSeats = typesOfSeats;
	}

	@Override
	public String toString() {
		return "Seats [bookingId=" + bookingId + ", showId=" + showId + ", userId=" + userId + ", bookedDate="
				 + ", noOfSeats=" + noOfSeats + ", noOfSeatsCancelled="
				+ noOfSeatsCancelled + ", costOfSeats=" + costOfSeats + ", typesOfSeats=" + typesOfSeats + "]";
	}

}
