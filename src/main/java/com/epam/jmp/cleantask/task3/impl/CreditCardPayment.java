package com.epam.jmp.cleantask.task3.impl;

import com.epam.jmp.cleantask.task3.PaymentMethod;

public class CreditCardPayment extends PaymentMethod {
    public boolean validatePaymentDetails() {
        // Validate credit card details
        return true;
    }

    public void processPayment(double amount) {
        // Process credit card payment
    }
}
