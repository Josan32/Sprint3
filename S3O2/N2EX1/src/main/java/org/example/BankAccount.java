package org.example;

public class BankAccount implements MethodPayment{
    @Override
    public void pay() {
        System.out.println("Connecting with your bank.... payment successful");
    }
}

