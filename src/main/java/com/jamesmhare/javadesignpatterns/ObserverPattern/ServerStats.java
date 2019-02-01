package com.jamesmhare.javadesignpatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Serves as an implementation of a subject that mimics a client listening for changes in the status of a server.
 */
public class ServerStats implements Subject {

    private List<Observer> observers;
    private String serverStatus;

    public ServerStats() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void setStatus(String status){
        this.serverStatus = status;
        notifyObservers();
    }

    @Override
    public String getStatus(){
        return serverStatus;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
