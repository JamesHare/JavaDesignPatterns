package com.jamesmhare.javadesignpatterns.SingletonPattern;

import java.util.*;

/**
 * Serves as a Singleton class for a deck of cards.
 */
public class Deck {

    private static volatile Deck singletonObj = null;

    private List<Card> currentDeck;

    private Deck() {
        currentDeck = new LinkedList<>();
    }

    /**
     * Gets the instance of the Singleton deck.
     * @return the instance of the Singleton deck.
     */
    public static Deck getInstance() {
        if (singletonObj == null) {
            synchronized (Deck.class) {
                if (singletonObj == null) {
                    singletonObj = new Deck();
                    singletonObj.reloadDeck();
                }
            }
        }
        return singletonObj;
    }

    /**
     * Checks that the deck has enough cards for the next hand.
     * @param numberOfPlayers - The number of players in game.
     */
    public void checkDeckStatus(int numberOfPlayers) {
        if (currentDeck.size() <= numberOfPlayers * 2) {
            reloadDeck();
        }
    }

    private void reloadDeck() {
        currentDeck.clear();
        currentDeck.addAll(FullDeck.fullDeck);
    }

    /**
     * Returns the current deck.
     * @return - a List of the Card object.
     */
    public List<Card> getCurrentDeck() {
        return currentDeck;
    }
}
