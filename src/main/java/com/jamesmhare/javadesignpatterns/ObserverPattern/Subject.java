package com.jamesmhare.javadesignpatterns.ObserverPattern;

/**
 * Serves as an interface of a subject that will register, unregister and notify observers.
 */
public interface Subject {

    /**
     * Registers an observer to the subject.
     * @param observer
     */
    void register(Observer observer);

    /**
     * Unregisters an observer to the subject.
     * @param observer
     */
    void unregister(Observer observer);

    /**
     * Notifies all observers of a subject.
     */
    void notifyObservers();

    /**
     * Returns the current status of the server.
     * @return the status of the server.
     */
    String getStatus();

    /**
     * Sets the current status of the server.
     * @param status - the status message of the subject.
     */
    void setStatus(String status);
}
