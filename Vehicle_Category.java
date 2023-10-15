package org.ncu.hirewheels.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle_Category {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_category_id")
	int vehicleCategoryId;
	@Column(name = "vehicle_category_name")
	String vehicleCategoryName;
	public int getVehicleCategoryId() {
		return vehicleCategoryId;
	}
	public void setVehicleCategoryId(int vehicleCategoryId) {
		this.vehicleCategoryId = vehicleCategoryId;
	}
	@Override
	public String toString() {
		return "Vehicle_Category [vehicleCategoryId=" + vehicleCategoryId + ", vehicleCategoryName="
				+ vehicleCategoryName + "]";
	}
	public String getVehicleCategoryName() {
		return vehicleCategoryName;
	}
	public void setVehicleCategoryName(String vehicleCategoryName) {
		this.vehicleCategoryName = vehicleCategoryName;
	}
}
