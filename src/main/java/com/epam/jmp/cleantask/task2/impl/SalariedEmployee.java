package com.epam.jmp.cleantask.task2.impl;

import com.epam.jmp.cleantask.task2.Employee;
import com.epam.jmp.cleantask.task2.Money;

import java.math.BigDecimal;

public class SalariedEmployee extends Employee {
    @Override
    public Money calculatePay() {
        return new Money(BigDecimal.valueOf(100));
    }

    @Override
    public Money calculateBonus() {
        return new Money(BigDecimal.valueOf(50));
    }
}
