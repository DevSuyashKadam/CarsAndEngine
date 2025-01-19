package com.example.cars.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long carId;
	private String carName;
	private String carCompany;
	private Long engineId;
	public Long getCarId() {
		return carId;
	}
	public void setCarId(Long carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	public Long getEngineId() {
		return engineId;
	}
	public void setEngineId(Long engineId) {
		this.engineId = engineId;
	}
	public Car(Long carId, String carName, String carCompany, Long engineId) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carCompany = carCompany;
		this.engineId = engineId;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
