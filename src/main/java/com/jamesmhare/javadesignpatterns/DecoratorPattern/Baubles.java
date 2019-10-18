package com.jamesmhare.javadesignpatterns.DecoratorPattern;

/**
 * A class to decorate a Christmas Tree with Baubles.
 */
public class Baubles extends TreeDecorator {

    public Baubles(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBaubles();
    }

    private String decorateWithBaubles() {
        return " with Baubles";
    }
}