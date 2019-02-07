package com.jamesmhare.javadesignpatterns.SingletonPattern;

/**
 * Serves as class for a card object.
 */
public class Card {

    private String cardName;
    private int cardValue;

    public Card(String cardName, int cardValue) {
        this.cardName = cardName;
        this.cardValue = cardValue;
    }

    /**
     * Returns the name of the card.
     * @return the card name as a String.
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Returns the value of the card.
     * @return the value of the card as an int.
     */
    public int getCardValue() {
        return cardValue;
    }

}
