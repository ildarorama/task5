package com.epam.jmp.cleantask.task3;

public abstract class PaymentMethod {
    protected abstract boolean validatePaymentDetails();

    protected abstract void processPayment(double amount);
}
