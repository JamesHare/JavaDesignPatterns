package com.jamesmhare.javadesignpatterns.ObserverPattern;

/**
 * Serves as the interface of the observer which will register to a subject and receive updates.
 */
public interface Observer {

    /**
     * Called by the subject to update the observer.
     */
    void update();
}
