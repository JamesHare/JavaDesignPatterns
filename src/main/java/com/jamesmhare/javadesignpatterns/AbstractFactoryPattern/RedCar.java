package com.jamesmhare.javadesignpatterns.AbstractFactoryPattern;

/**
 * Serves as an implementation of the Blue Car vehicle.
 */
public class RedCar implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Red Car is starting engine.");
    }

}
