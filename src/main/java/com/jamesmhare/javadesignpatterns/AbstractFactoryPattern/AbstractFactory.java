package com.jamesmhare.javadesignpatterns.AbstractFactoryPattern;

/**
 * Serves as an abstract factory class for creating vehicles.
 */
public abstract class AbstractFactory {

    /**
     * Creates a new vehicle.
     * @param vehicleType - The type of vehicle.
     * @return a new vehicle object of the given type.
     */
    public abstract Vehicle createVehicle(String vehicleType);

}
