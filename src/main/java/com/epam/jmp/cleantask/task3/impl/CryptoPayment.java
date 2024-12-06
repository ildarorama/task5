package com.epam.jmp.cleantask.task3.impl;

public class CryptoPayment extends PayPalPayment {
    public boolean validatePaymentDetails() {
        return true;
    }

    public void processPayment(double amount) {

    }
}
