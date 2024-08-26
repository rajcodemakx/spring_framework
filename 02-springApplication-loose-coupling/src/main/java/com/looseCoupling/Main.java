package com.looseCoupling;


import com.looseCoupling.handler.BillHandler;
import com.looseCoupling.implementation.CreditCard;
import com.looseCoupling.implementation.UPI;

public class Main {

    public static void main(String[] args) {

        // object one credit card
        CreditCard creditCard = new CreditCard();

        // object upi
        UPI upi = new UPI();

        BillHandler billHandler = new BillHandler(creditCard);
        billHandler.payment(1000);
    }
}