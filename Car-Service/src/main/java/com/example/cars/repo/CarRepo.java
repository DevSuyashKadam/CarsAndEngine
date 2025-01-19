package com.example.cars.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cars.entity.Car;

public interface CarRepo extends JpaRepository<Car, Long>{

	Car findBycarId(Long carId);

	//Car delete(Long carId);

	Car save(Long carId);


	
}


//Engine findBycarcc(long engineCC);