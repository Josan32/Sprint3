package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            ShoeStore store1 = new ShoeStore("Nike", 45.7F, 43.0F);
            MethodPayment creditCar = new CreditCard();
            MethodPayment paypal = new Paypal();
            MethodPayment bankAccount = new BankAccount();

            System.out.println("Choose a payment method, 1.- Credit car, 2.-Paypal, 3.- bank account");
            int option =  input.nextInt();
            switch (option){
                case 1:
                    store1.sell(creditCar);
                    break;
                case 2:
                    store1.sell(paypal);
                    break;
                case 3:
                    store1.sell(bankAccount);
                    break;
                default:
                    break;
            };

        System.out.println(store1);;

        }
}