package com.jamesmhare.javadesignpatterns.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Serves as an implementation of the {@code Burger}.
 */
public class BurgerImpl implements Burger {

    private String bread;
    private String cheese;
    private String meat;
    private List<String> toppings = new ArrayList<>();

    @Override
    public BurgerImpl withBread(String bread) {
        this.bread = bread;
        return this;
    }

    @Override
    public BurgerImpl withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public BurgerImpl withMeat(String meat) {
        this.meat = meat;
        return this;
    }

    @Override
    public BurgerImpl withTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public BurgerImpl build() {
        return this;
    }

    @Override
    public void printOrder() {
        System.out.println("You have ordered a burger with");
        if (this.meat != null) {System.out.println("Meat: " + this.meat);}
        if (this.bread != null) {System.out.println("Bread: " + this.bread);}
        if (this.cheese != null) {System.out.println("Cheese: " + this.cheese);}
        if (this.toppings.size() > 0) {
            System.out.println("Toppings: ");
            for (String topping : toppings) {
                System.out.println("       " + topping);
            }
        }
    }
}
