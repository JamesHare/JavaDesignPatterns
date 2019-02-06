package com.jamesmhare.javadesignpatterns.AbstractFactoryPattern;

/**
 * Serves as an implementation of the Red Motorbike vehicle.
 */
public class RedMotorbike implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Red Motorbike is starting engine.");
    }

}
