package com.jamesmhare.javadesignpatterns.FactoryPattern;

/**
 * Serves as a class for the Apollo character.
 */
public class Apollo extends GameCharacter {

    public Apollo() {
        this.setName("Apollo");
        this.setAttackPower((Math.random() * 10) + 0.1);
        this.setSpeed((Math.random() * 10) + 0.1);
    }
}
