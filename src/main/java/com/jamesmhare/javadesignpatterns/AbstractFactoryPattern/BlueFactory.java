package com.jamesmhare.javadesignpatterns.AbstractFactoryPattern;

/**
 * Serves as a factory for creating a blue vehicle.
 */
public class BlueFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("CAR")) {
            return new BlueCar();
        } else if (vehicleType.equalsIgnoreCase("MOTORBIKE")) {
            return new BlueMotorbike();
        } else {
            return null;
        }
    }

}
