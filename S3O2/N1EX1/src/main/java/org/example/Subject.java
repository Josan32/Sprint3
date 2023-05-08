package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private double price;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers( ){
        observers.forEach(x -> x.update());
    }
}
