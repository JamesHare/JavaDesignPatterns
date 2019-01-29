package com.jamesmhare.javadesignpatterns;

import com.jamesmhare.javadesignpatterns.StrategyPattern.Hero;
import com.jamesmhare.javadesignpatterns.StrategyPattern.LightningBoy;
import com.jamesmhare.javadesignpatterns.StrategyPattern.ThunderGirl;
import com.jamesmhare.javadesignpatterns.StrategyPattern.ThunderKick;

/**
 * This class serves as an entry point for the Java Design Patterns application. It allows us to
 * play with the design patterns
 */
public class Playground {

    public static Hero heroCharacterTwo;
    private static Hero heroCharacterOne;

    public static void main(String[] args) {

        // The Strategy Pattern

        heroCharacterOne = new LightningBoy();
        heroCharacterTwo = new ThunderGirl();

        System.out.println("Hero Character One: " + heroCharacterOne.usePower());
        System.out.println("Hero Character Two: " + heroCharacterTwo.usePower());

        heroCharacterOne.setPower(new ThunderKick());
        System.out.println("Hero Character One: " + heroCharacterOne.usePower());
    }

}
