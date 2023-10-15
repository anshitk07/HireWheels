package org.ncu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	int vehicleId;
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleModel=" + vehicleModel + ", vehicleNumber=" + vehicleNumber
				+ ", vehicleSubcategoryId=" + vehicleSubcategoryId + ", color=" + color + ", locationId=" + locationId
				+ ", fuelTypeId=" + fuelTypeId + ", availabilityStatus=" + availabilityStatus + ", vehicleImageUrl="
				+ vehicleImageUrl + "]";
	}
	@Column(name = "vehicle_model")
	String vehicleModel;
	@Column(name = "vehicle_number")
	String vehicleNumber;
	@Column(name = "vehicle_subcategory_id")
	int vehicleSubcategoryId;
	@Column(name = "color")
	String color;
	@Column(name = "location_id")
	int locationId;
	@Column(name = "fuel_type_id")
	int fuelTypeId;
	@Column(name = "availability_status")
	int availabilityStatus;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public int getVehicleSubcategoryId() {
		return vehicleSubcategoryId;
	}
	public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
		this.vehicleSubcategoryId = vehicleSubcategoryId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getFuelTypeId() {
		return fuelTypeId;
	}
	public void setFuelTypeId(int fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}
	public int getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void setAvailabilityStatus(int availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}
	public String getVehicleImageUrl() {
		return vehicleImageUrl;
	}
	public void setVehicleImageUrl(String vehicleImageUrl) {
		this.vehicleImageUrl = vehicleImageUrl;
	}
	@Column(name = "vehicle_image_url")
	String vehicleImageUrl;
	
}
