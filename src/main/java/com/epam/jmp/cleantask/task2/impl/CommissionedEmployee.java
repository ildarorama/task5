package com.epam.jmp.cleantask.task2.impl;

import com.epam.jmp.cleantask.task2.Employee;
import com.epam.jmp.cleantask.task2.Money;

import java.math.BigDecimal;

public class CommissionedEmployee extends Employee {
    @Override
    public Money calculatePay() {
        return new Money(BigDecimal.TEN);
    }

    @Override
    public Money calculateBonus() {
        return new Money(BigDecimal.TEN.min(BigDecimal.ONE));
    }
}
