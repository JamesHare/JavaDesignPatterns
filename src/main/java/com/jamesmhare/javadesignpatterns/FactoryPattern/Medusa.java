package com.jamesmhare.javadesignpatterns.FactoryPattern;

/**
 * Serves as a class for the Medusa character.
 */
public class Medusa extends GameCharacter {

    public Medusa() {
        this.setName("Medusa");
        this.setAttackPower((Math.random() * 10) + 0.1);
        this.setSpeed((Math.random() * 10) + 0.1);
    }

}
