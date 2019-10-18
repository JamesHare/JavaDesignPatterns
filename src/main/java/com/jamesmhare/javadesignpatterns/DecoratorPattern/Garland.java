package com.jamesmhare.javadesignpatterns.DecoratorPattern;

/**
 * A class to decorate a Christmas Tree with Garland.
 */
public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }

}
