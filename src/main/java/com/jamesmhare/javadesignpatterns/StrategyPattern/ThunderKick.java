package com.jamesmhare.javadesignpatterns.StrategyPattern;

/**
 * Serves as the implementation of the Thunder Kick Super Power.
 */
public class ThunderKick implements SuperPower {

    @Override
    public String executeSuperPower() {
        return new String("Performing Thunder Kick!");
    }
}
