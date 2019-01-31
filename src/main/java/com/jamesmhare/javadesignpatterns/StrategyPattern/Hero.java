package com.jamesmhare.javadesignpatterns.StrategyPattern;

/**
 * Serves as the super class for a hero character.
 */
public class Hero {

    public SuperPower power;

    public void setPower(SuperPower power) {
        this.power = power;
    }

    public String usePower() {
        return power.executeSuperPower();
    }
}
