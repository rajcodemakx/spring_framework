package org.tightCoupling;


import org.tightCoupling.dependent.CreditCard;
import org.tightCoupling.dependent.UPI;
import org.tightCoupling.target.CashCollector;

public class Main {

    public static void main(String[] args) {

        // 1. Credit card
        CreditCard creditCard = new CreditCard();

        // 2. UPI
        UPI upi = new UPI();


        CashCollector cashCollector = new CashCollector();


        // 1. object inject through set
        cashCollector.setUpi(upi);
        cashCollector.payment(1000);
    }
}