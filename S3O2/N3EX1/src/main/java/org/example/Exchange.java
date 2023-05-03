package org.example;

public class Exchange {

    private Converter currency;

    public Exchange(Converter currency) {
        this.currency = currency;
    }

    public void change(double amount){
        currency.converter(amount);
    }


}
