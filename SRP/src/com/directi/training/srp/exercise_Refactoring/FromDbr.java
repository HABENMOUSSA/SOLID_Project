package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class FromDb
{
	
	private Cars _voiture;
	
	public Car getFromDb(final String carId)
    {
        for (Car car : _voiture.carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
	
}
  
