package org.example;

public class CoinMarketCap extends Observer{

    public CoinMarketCap(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("CoinMarketCap price updated: " + subject.getPrice() + " $");
    }
}
