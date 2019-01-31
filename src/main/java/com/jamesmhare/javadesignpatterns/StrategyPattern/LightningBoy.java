package com.jamesmhare.javadesignpatterns.StrategyPattern;

/**
 * Serves as a class for the Lightning Boy character.
 */
public class LightningBoy extends Hero {

    public LightningBoy(){
        super();
        power = new LightningJump();
    }
}
