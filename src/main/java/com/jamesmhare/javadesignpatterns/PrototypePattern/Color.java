package com.jamesmhare.javadesignpatterns.PrototypePattern;

/**
 * A cloneable abstract color class.
 */
public abstract class Color implements Cloneable {

    protected String colorName;

    public abstract void addColor();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
