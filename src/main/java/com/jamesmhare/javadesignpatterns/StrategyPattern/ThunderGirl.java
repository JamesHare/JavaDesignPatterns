package com.jamesmhare.javadesignpatterns.StrategyPattern;

/**
 * Serves as a class for the Lightning Boy character.
 */
public class ThunderGirl extends Hero {

    public ThunderGirl(){
        super();
        power = new ThunderKick();
    }
}
