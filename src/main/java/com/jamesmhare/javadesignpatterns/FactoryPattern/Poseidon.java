package com.jamesmhare.javadesignpatterns.FactoryPattern;

/**
 * Serves as a class for the Poseidon character.
 */
public class Poseidon extends GameCharacter {

    public Poseidon() {
        this.setName("Poseidon");
        this.setAttackPower((Math.random() * 10) + 0.1);
        this.setSpeed((Math.random() * 10) + 0.1);
    }

}
