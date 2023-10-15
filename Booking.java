package org.ncu.hirewheels.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	int bookingId;
	@Column(name = "pickup_date")
	Date pickupDate;
	@Column(name = "dropoff_date")
	Date dropoffDate;
	@Column(name = "booking_date")
	Date bookingDate;
	@Column(name = "amount")
	int amount;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", pickupDate=" + pickupDate + ", dropoffDate=" + dropoffDate
				+ ", bookingDate=" + bookingDate + ", amount=" + amount + ", locationId=" + locationId + ", vehicleId="
				+ vehicleId + ", userId=" + userId + "]";
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}
	public Date getDropoffDate() {
		return dropoffDate;
	}
	public void setDropoffDate(Date dropoffDate) {
		this.dropoffDate = dropoffDate;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column(name = "location_id")
	int locationId;
	@Column(name = "vehicle_id")
	int vehicleId;
	@Column(name = "user_id")
	int userId;
	
	
}
