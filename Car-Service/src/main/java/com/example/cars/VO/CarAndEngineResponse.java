package com.example.cars.VO;

import com.example.cars.entity.Car;

public class CarAndEngineResponse {

	
	private Car car;
	private Engine engine;
	public Car getCar() {
		return car;
	}
	public CarAndEngineResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarAndEngineResponse(Car car, Engine engine) {
		super();
		this.car = car;
		this.engine = engine;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	
	
}
