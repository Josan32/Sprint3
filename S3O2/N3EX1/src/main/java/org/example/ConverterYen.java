package org.example;

public class ConverterYen implements Converter {

    @Override
    public void converter(double amount) {
        double change = amount * 149.66;
        System.out.println(amount + "€" + " are "+ change+"¥");

    }
}
