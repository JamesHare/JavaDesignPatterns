package com.jamesmhare.javadesignpatterns.AbstractFactoryPattern;

/**
 * Serves as an implementation of the Blue Motorbike vehicle.
 */
public class BlueMotorbike implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Blue Motorbike is starting engine.");
    }

}
