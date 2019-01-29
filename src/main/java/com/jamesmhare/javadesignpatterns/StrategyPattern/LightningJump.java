package com.jamesmhare.javadesignpatterns.StrategyPattern;

/**
 * Serves as the implementation of the Lightning Jump Super Power.
 */
public class LightningJump implements SuperPower {

    @Override
    public String executeSuperPower() {
        return new String("Performing Lightning Jump!");
    }
}
