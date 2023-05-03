package org.example;

public class ConverterUsdt implements Converter{

    @Override
    public  void converter(double amount) {
        double change = amount * 1.10;
        System.out.println(amount + "€"+ " are "+ change + "$");
    }
}
