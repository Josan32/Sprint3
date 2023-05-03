package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Exchange exchangeUsdt = new Exchange(new ConverterUsdt());
        Exchange exchangeYen = new Exchange(new ConverterYen());

        Scanner sc = new Scanner(System.in);
        System.out.println("Indicates the amount of euros you want to exchange.");
        double currency = sc.nextDouble();

        exchangeYen.change(currency);
        exchangeUsdt.change(currency);

    }
}