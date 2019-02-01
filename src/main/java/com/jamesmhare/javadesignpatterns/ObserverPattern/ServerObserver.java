package com.jamesmhare.javadesignpatterns.ObserverPattern;

/**
 * Serves as the implementation of an observer that mimics the monitoring system of a server.
 */
public class ServerObserver implements Observer {

    protected Subject serverStatus;
    private String serverObserverName;

    public ServerObserver(String serverObserverName, Subject serverStatus) {
        this.serverObserverName = serverObserverName;
        this.serverStatus = serverStatus;
        this.serverStatus.register(this);
    }

    @Override
    public void update() {
        System.out.println(serverObserverName + " received a message that the server is now " + serverStatus.getStatus());
    }
}
