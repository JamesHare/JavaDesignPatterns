package com.jamesmhare.javadesignpatterns.BuilderPattern;

import java.util.List;

/**
 * Serves as an interface for the burger object.
 */
public interface Burger {

    /**
     Sets the type of bread for the burger.
     * @param bread String type of bread for the burger.
     * @return the burger object.
     */
    Burger withBread(String bread);

    /**
     * Sets the type of cheese for the burger.
     * @param cheese String type of cheese for the burger.
     * @return the burger object.
     */
    Burger withCheese(String cheese);

    /**
     * Sets the type of meat for the burger.
     * @param meat String type of meat for the burger.
     * @return the burger object.
     */
    Burger withMeat(String meat);

    /**
     * Sets a new topping for the burger.
     * @param topping as a String
     * @return the burger object.
     */
    Burger withTopping(String topping);

    /**
     * Builds the burger object.
     * @return the burger.
     */
    Burger build();

    /**
     * Prints the order back for the customer.
     */
    void printOrder();

}
