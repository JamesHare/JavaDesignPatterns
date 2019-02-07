package com.jamesmhare.javadesignpatterns.SingletonPattern;

import java.util.Arrays;
import java.util.List;

/**
 * Serves as a class to hold a full and complete deck of cards.
 */
public class FullDeck {

    public static List<Card> fullDeck = Arrays.asList(
            new Card("Ace of Hearts", 11),
            new Card("2 of Hearts", 2),
            new Card("3 of Hearts", 3),
            new Card("4 of Hearts", 4),
            new Card("5 of Hearts", 5),
            new Card("6 of Hearts", 6),
            new Card("7 of Hearts", 7),
            new Card("8 of Hearts", 8),
            new Card("9 of Hearts", 9),
            new Card("10 of Hearts", 10),
            new Card("Jack of Hearts", 10),
            new Card("Queen of Hearts", 10),
            new Card("King of Hearts", 10),
            new Card("Ace of Clubs", 11),
            new Card("2 of Clubs", 2),
            new Card("3 of Clubs", 3),
            new Card("4 of Clubs", 4),
            new Card("5 of Clubs", 5),
            new Card("6 of Clubs", 6),
            new Card("7 of Clubs", 7),
            new Card("8 of Clubs", 8),
            new Card("9 of Clubs", 9),
            new Card("10 of Clubs", 10),
            new Card("Jack of Clubs", 10),
            new Card("Queen of Clubs", 10),
            new Card("King of Clubs", 10),
            new Card("Ace of Diamonds", 11),
            new Card("2 of Diamonds", 2),
            new Card("3 of Diamonds", 3),
            new Card("4 of Diamonds", 4),
            new Card("5 of Diamonds", 5),
            new Card("6 of Diamonds", 6),
            new Card("7 of Diamonds", 7),
            new Card("8 of Diamonds", 8),
            new Card("9 of Diamonds", 9),
            new Card("10 of Diamonds", 10),
            new Card("Jack of Diamonds", 10),
            new Card("Queen of Diamonds", 10),
            new Card("King of Diamonds", 10),
            new Card("Ace of Spades", 11),
            new Card("2 of Spades", 2),
            new Card("3 of Spades", 3),
            new Card("4 of Spades", 4),
            new Card("5 of Spades", 5),
            new Card("6 of Spades", 6),
            new Card("7 of Spades", 7),
            new Card("8 of Spades", 8),
            new Card("9 of Spades", 9),
            new Card("10 of Spades", 10),
            new Card("Jack of Spades", 10),
            new Card("Queen of Spades", 10),
            new Card("King of Spades", 10)
    );
}
