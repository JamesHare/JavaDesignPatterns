package com.jamesmhare.javadesignpatterns;

import com.jamesmhare.javadesignpatterns.AbstractFactoryPattern.AbstractFactory;
import com.jamesmhare.javadesignpatterns.AbstractFactoryPattern.FactoryProducer;
import com.jamesmhare.javadesignpatterns.AbstractFactoryPattern.Vehicle;
import com.jamesmhare.javadesignpatterns.FactoryPattern.GameCharacter;
import com.jamesmhare.javadesignpatterns.FactoryPattern.GameCharacterFactory;
import com.jamesmhare.javadesignpatterns.ObserverPattern.Observer;
import com.jamesmhare.javadesignpatterns.ObserverPattern.ServerStats;
import com.jamesmhare.javadesignpatterns.ObserverPattern.ServerObserver;
import com.jamesmhare.javadesignpatterns.ObserverPattern.Subject;
import com.jamesmhare.javadesignpatterns.SingletonPattern.Deck;
import com.jamesmhare.javadesignpatterns.SingletonPattern.Player;
import com.jamesmhare.javadesignpatterns.StrategyPattern.Hero;
import com.jamesmhare.javadesignpatterns.StrategyPattern.LightningBoy;
import com.jamesmhare.javadesignpatterns.StrategyPattern.ThunderGirl;
import com.jamesmhare.javadesignpatterns.StrategyPattern.ThunderKick;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

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
    private static GameCharacterFactory gameCharacterFactory;
    private static Random randNumber = new Random();

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

        // The Factory Pattern

        gameCharacterFactory = new GameCharacterFactory();
        GameCharacter characterOne = gameCharacterFactory.createGameCharacter(randNumber.nextInt(4) + 1);
        System.out.println(characterOne.getName() + " has entered the arena.");
        GameCharacter characterTwo = gameCharacterFactory.createGameCharacter(randNumber.nextInt(4) + 1);
        System.out.println(characterTwo.getName() + " has entered the arena.");
        while (characterOne.getStatus().toUpperCase().equals("Alive".toUpperCase()) && characterTwo.getStatus().toUpperCase().equals("Alive".toUpperCase())) {
            characterOne.attack(characterTwo);
            if (characterTwo.getStatus().toUpperCase().equals("Alive".toUpperCase())) {
                characterTwo.attack(characterOne);
            }
        }

        // The Abstract Factory Pattern

        AbstractFactory redVehicleFactory = FactoryProducer.createFactory("Red");
        Vehicle redCar = redVehicleFactory.createVehicle("Car");
        redCar.startEngine();
        Vehicle redMotorbike = redVehicleFactory.createVehicle("Motorbike");
        redMotorbike.startEngine();

        AbstractFactory blueVehicleFactory = FactoryProducer.createFactory("Blue");
        Vehicle blueCar = blueVehicleFactory.createVehicle("Car");
        blueCar.startEngine();
        Vehicle blueMotorbike = blueVehicleFactory.createVehicle("Motorbike");
        blueMotorbike.startEngine();

        // The Singleton Pattern

        Deck theDeck = Deck.getInstance();

        Player dealer = new Player("Dealer");
        List<Player> players = Arrays.asList(
                new Player("John"),
                new Player("Stephen"),
                new Player("Diane")
        );

        for (int i = 0; i < 8; i++) { // for three rounds
            System.out.println("Round " + (i+1));
            dealer.drawCards();
            dealer.playTurn();
            for(Player player : players) {
                player.drawCards();
                player.playTurn();
                if (player.getHandValue() == dealer.getHandValue()) {
                    System.out.println(player.getPlayerName() + " draws with the dealer. Push.");
                } else if (player.getHandValue() == 21) {
                    System.out.println(player.getPlayerName() + " wins! Winner Winner Chicken Dinner!");
                } else if (player.getHandValue() > dealer.getHandValue()) {
                    System.out.println(player.getPlayerName() + " wins!");
                } else {
                    System.out.println(player.getPlayerName() + " loses.");
                }
            }
            System.out.println("The size of the deck is now " + Deck.getInstance().getCurrentDeck().size());
            Deck.getInstance().checkDeckStatus(players.size() + 1);
        }

        Deck theDeck2 = Deck.getInstance();
        System.out.println("The size of the second deck is " + theDeck2.getInstance().getCurrentDeck().size()
            + ", which is the same size of the first deck because it is a Singleton.");

    }

}
