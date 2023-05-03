package org.example;

public class Paypal implements MethodPayment{
    @Override
    public void pay() {
        System.out.println("Paypal successful");
    }
}
