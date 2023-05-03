package org.example;

public class CreditCard implements MethodPayment {
    @Override
    public void pay() {
        System.out.println("Card accepted");
    }
}
