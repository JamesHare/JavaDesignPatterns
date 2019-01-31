package com.jamesmhare.javadesignpatterns;

import com.jamesmhare.javadesignpatterns.StrategyPattern.Hero;
import com.jamesmhare.javadesignpatterns.StrategyPattern.LightningBoy;
import com.jamesmhare.javadesignpatterns.StrategyPattern.ThunderGirl;

/**
 * This class serves as an entry point for the Java Design Patterns application. It allows us to
 * play with the design patterns
 */
public class Playground {

    public static Hero heroCharacterTwo;
    private static Hero heroCharacterOne;

    public static void main(String[] args) {
        heroCharacterOne = new LightningBoy();
        heroCharacterTwo = new ThunderGirl();

        heroCharacterOne.usePower();
        heroCharacterTwo.usePower();
    }

}
