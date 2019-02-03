package com.jamesmhare.javadesignpatterns.FactoryPattern;

/**
 * Serves as a class for the Athena character.
 */
public class Athena extends GameCharacter {

    public Athena(){
        this.setName("Athena");
        this.setAttackPower((Math.random() * 10) + 0.1);
        this.setSpeed((Math.random() * 10) + 0.1);
    }

}
