package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class BestCar
{
    private Cars _voiture;
    
   

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _voiture.carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
