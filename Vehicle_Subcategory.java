package org.ncu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle_Subcategory {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_subcategory_id")
	int vehicleSubcategoryId;
	@Column(name = "vehicle_subcategory_name")
	String vehicleSubcategoryName;
	@Column(name = "price_per_day")
	int pricePerDay;
	public int getVehicleSubcategoryId() {
		return vehicleSubcategoryId;
	}
	public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
		this.vehicleSubcategoryId = vehicleSubcategoryId;
	}
	public String getVehicleSubcategoryName() {
		return vehicleSubcategoryName;
	}
	public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
		this.vehicleSubcategoryName = vehicleSubcategoryName;
	}
	public int getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	@Override
	public String toString() {
		return "Vehicle_Subcategory [vehicleSubcategoryId=" + vehicleSubcategoryId + ", vehicleSubcategoryName="
				+ vehicleSubcategoryName + ", pricePerDay=" + pricePerDay + ", vehicleCategoryId=" + vehicleCategoryId
				+ "]";
	}
	public int getVehicleCategoryId() {
		return vehicleCategoryId;
	}
	public void setVehicleCategoryId(int vehicleCategoryId) {
		this.vehicleCategoryId = vehicleCategoryId;
	}
	@Column(name = "vehicle_category_id")
	int vehicleCategoryId;
}
