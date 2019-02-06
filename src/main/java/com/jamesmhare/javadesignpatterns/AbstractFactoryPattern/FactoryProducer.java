package com.jamesmhare.javadesignpatterns.AbstractFactoryPattern;

/**
 * Serves as a factory for creating factories of different vehicle colors.
 */
public class FactoryProducer {

    public static AbstractFactory createFactory(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new RedFactory();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new BlueFactory();
        } else {
            return null;
        }
    }

}
