package org.example;

public class Binance  extends Observer{

    public Binance(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Binance price updated: " + subject.getPrice() + " $");
    }
}
