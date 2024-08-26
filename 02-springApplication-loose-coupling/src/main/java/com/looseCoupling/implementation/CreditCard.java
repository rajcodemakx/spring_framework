package com.looseCoupling.implementation;

import com.looseCoupling.interfaces.PaymentGateWay;

public class CreditCard implements PaymentGateWay {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " amount received  successfully");
        System.out.println(" amount received  credit card");
    }
}
