package com.epam.jmp.cleantask.task3.impl;

import com.epam.jmp.cleantask.task3.PaymentMethod;

public class PayPalPayment extends PaymentMethod {
    public boolean validatePaymentDetails() {
        // Validate PayPal account
        return false;
    }

    public void processPayment(double amount) {
        // Log in to PayPal and process payment
        // Throws UnsupportedOperationException if the PayPal account is not linked to a bank account
    }

}
