package org.tightCoupling.dependent;

public class CreditCard {

    public void pay(double amount) {

        if (amount != 0) {
            System.out.println("Amount successfully received : " + amount);
            System.out.println("Amount is received on credit card ");
        } else {
            System.out.println("amount Not received");
        }
    }
}
