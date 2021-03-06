package com.jamesmhare.javadesignpatterns.SingletonPattern;

import java.util.*;

/**
 * Serves as a class for the player object.
 */
public class Player {

    private String playerName;
    private List<Card> cardsInHand;
    private Deck currentDeck;

    public Player(String playerName) {
        this.playerName = playerName;
        cardsInHand = new LinkedList<>();
        currentDeck = Deck.getInstance();
    }

    /**
     * Allows the player to draw two random cards from the current deck.
     */
    public void drawCards() {
        cardsInHand.clear();
        cardsInHand.add(currentDeck.getCurrentDeck().remove((int)(Math.random() * currentDeck.getCurrentDeck().size())));
        cardsInHand.add(currentDeck.getCurrentDeck().remove((int)(Math.random() * currentDeck.getCurrentDeck().size())));
    }

    /**
     * Calculates and returns the value of the players hand.
     * @return - value of the players hand as an int.
     */
    public int getHandValue() {
        return cardsInHand.get(0).getCardValue() + cardsInHand.get(1).getCardValue();
    }

    /**
     * Prints a message when a player is playing their turn.
     */
    public void playTurn() {
        System.out.println(playerName + " has the " +
                cardsInHand.get(0).getCardName() + " and the " +
                cardsInHand.get(1).getCardName() + " in their hand (" + this.getHandValue() + ").");
    }

    /**
     * Returns the name of the player.
     * @return the name of the player as a String.
     */
    public String getPlayerName() {
        return playerName;
    }

}
