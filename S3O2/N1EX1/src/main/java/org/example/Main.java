package org.example;


public class Main {
    public static void main(String[] args) {

        Subject bitcoin = new Subject();


        new Binance(bitcoin);
        new CoinMarketCap(bitcoin);

        System.out.println("First update");
        bitcoin.setPrice(12.5f);

        System.out.println("Second update");
        bitcoin.setPrice(9.5f);

    }
}