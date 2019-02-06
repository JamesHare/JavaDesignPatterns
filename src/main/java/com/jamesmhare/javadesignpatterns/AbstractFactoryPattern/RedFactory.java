package com.jamesmhare.javadesignpatterns.AbstractFactoryPattern;

/**
 * Serves as a factory for creating a red vehicle.
 */
public class RedFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("CAR")) {
            return new RedCar();
        } else if (vehicleType.equalsIgnoreCase("MOTORBIKE")) {
            return new RedMotorbike();
        } else {
            return null;
        }
    }

}
