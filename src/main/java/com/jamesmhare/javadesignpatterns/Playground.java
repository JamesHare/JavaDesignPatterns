package com.jamesmhare.javadesignpatterns;

import com.jamesmhare.javadesignpatterns.ObserverPattern.Observer;
import com.jamesmhare.javadesignpatterns.ObserverPattern.ServerStats;
import com.jamesmhare.javadesignpatterns.ObserverPattern.ServerObserver;
import com.jamesmhare.javadesignpatterns.ObserverPattern.Subject;
import com.jamesmhare.javadesignpatterns.StrategyPattern.Hero;
import com.jamesmhare.javadesignpatterns.StrategyPattern.LightningBoy;
import com.jamesmhare.javadesignpatterns.StrategyPattern.ThunderGirl;
import com.jamesmhare.javadesignpatterns.StrategyPattern.ThunderKick;

/**
 * This class serves as an entry point for the Java Design Patterns application. It allows us to
 * play with the design patterns
 */
public class Playground {

    private static Hero heroCharacterTwo;
    private static Hero heroCharacterOne;
    private static Subject server;
    private static Observer clientOne;
    private static Observer clientTwo;
    private static Observer clientThree;


    public static void main(String[] args) {

        // The Strategy Pattern

        heroCharacterOne = new LightningBoy();
        heroCharacterTwo = new ThunderGirl();

        System.out.println("Hero Character One: " + heroCharacterOne.usePower());
        System.out.println("Hero Character Two: " + heroCharacterTwo.usePower());

        heroCharacterOne.setPower(new ThunderKick());
        System.out.println("Hero Character One: " + heroCharacterOne.usePower());


        // The Observer Pattern

        server = new ServerStats();
        clientOne = new ServerObserver("ClientOne", server);
        clientTwo = new ServerObserver("ClientTwo", server);
        clientThree = new ServerObserver("ClientThree", server);

        server.setStatus("ON");
        server.setStatus("OFF");

    }

}
