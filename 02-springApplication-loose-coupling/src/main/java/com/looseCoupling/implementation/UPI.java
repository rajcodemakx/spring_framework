package com.looseCoupling.implementation;

import com.looseCoupling.interfaces.PaymentGateWay;

public class UPI implements PaymentGateWay {

    @Override
    public void pay(double amount) {
        System.out.println(amount + " amount received  successfully");
        System.out.println(" amount received  credit UPI");
    }
}
