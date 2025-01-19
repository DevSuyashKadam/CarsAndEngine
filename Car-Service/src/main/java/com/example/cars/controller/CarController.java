package com.example.cars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cars.VO.CarAndEngineResponse;
import com.example.cars.entity.Car;
import com.example.cars.service.CarService;

@RestController
@RequestMapping("/")
public class CarController {

	
	
	@Autowired
	private CarService cs;
	
	
	@PostMapping("/cars/")
	public Car saveMyCar(@RequestBody Car car) {
		return cs.saveMyCar(car);
		
	}
	
	@GetMapping("/cars/{carId}")
	public Car giveMeCar(@PathVariable Long carId) {
		return cs.giveMeCar(carId);
		
	}
	
	@GetMapping("/cars/eng/{carId}")
     public CarAndEngineResponse giveMeCarAndEngine(@PathVariable Long carId) {
		
		//here i want car details+engine details
		
		return cs.giveMeCarAndEngine(carId);
		
	}
	
//	@DeleteMapping("/cars/{carId}")
//	
//	public Car deleteCar(@PathVariable Long carId) {
//		return cs.deleteCar(carId);
//	}
	
	
	@PutMapping("/cars/{carId}")
	public Car updateCar(@PathVariable Long carId) {
		return cs.updateCar(carId);
	}
	
	
	
	

	
}
