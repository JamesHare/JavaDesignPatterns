package com.jamesmhare.javadesignpatterns.AbstractFactoryPattern;

/**
 * Serves as an implementation of the Blue Car vehicle.
 */
public class BlueCar implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Blue Car is starting engine.");
    }

}
