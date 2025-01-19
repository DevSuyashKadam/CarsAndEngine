 package com.example.cars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.cars.VO.CarAndEngineResponse;
import com.example.cars.VO.Engine;
import com.example.cars.entity.Car;
import com.example.cars.repo.CarRepo;

@Service
public class CarService {
	@Autowired
	private CarRepo cr;
	
	public Car saveMyCar(Car car) {
		// TODO Auto-generated method stub
		return cr.save(car);
	}

	public Car giveMeCar(Long carId) {
		return cr.findBycarId(carId);
	}
	
	//suyash

	public CarAndEngineResponse giveMeCarAndEngine(Long carId) {
		// TODO Auto-generated method stub

		CarAndEngineResponse car_n_engine=new CarAndEngineResponse();
		Car car=cr.findBycarId(carId);

		
		//very important 
	
		RestTemplate rt=new RestTemplate();
		Engine engine =rt.getForObject("http://localhost:7001/engine/"+car.getEngineId(), Engine.class);
		

	
	car_n_engine.setCar(car);
	car_n_engine.setEngine(engine);
	
	return car_n_engine;
	
	}

//	public Car deleteCar(Long carId) {
//		// TODO Auto-generated method stub
//		return cr.delet
//	}

	public Car updateCar(Long carId) {
		// TODO Auto-generated method stub
		return cr.save(carId);
	}

	

	

	
	
	
	
}
