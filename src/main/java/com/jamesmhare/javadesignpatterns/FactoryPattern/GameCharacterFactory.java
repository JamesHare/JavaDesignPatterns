package com.jamesmhare.javadesignpatterns.FactoryPattern;

/**
 * Serves as a factory for creating game characters.
 */
public class GameCharacterFactory {

    public GameCharacter createGameCharacter(int characterNumber) {

        if (characterNumber == 1) {
            return new Apollo();
        } else if (characterNumber == 2) {
            return new Athena();
        } else if (characterNumber == 3) {
            return new Medusa();
        } else if (characterNumber == 4) {
            return new Poseidon();
        } else {
            return null;
        }

    }

}
