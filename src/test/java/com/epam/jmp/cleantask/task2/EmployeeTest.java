package com.epam.jmp.cleantask.task2;

import com.epam.jmp.cleantask.task2.impl.CommissionedEmployee;
import com.epam.jmp.cleantask.task2.impl.HourlyEmployee;
import com.epam.jmp.cleantask.task2.impl.SalariedEmployee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class EmployeeTest {

    @Test
    public void testHourly() {
        Employee e = new HourlyEmployee();
        Assertions.assertEquals(BigDecimal.ONE, e.calculatePay().amount());
        Assertions.assertEquals(BigDecimal.ZERO, e.calculateBonus().amount());
    }

    @Test
    public void testSalaried() {
        Employee e = new SalariedEmployee();
        Assertions.assertEquals(BigDecimal.valueOf(100), e.calculatePay().amount());
        Assertions.assertEquals(BigDecimal.valueOf(50), e.calculateBonus().amount());
    }

    @Test
    public void testCommissioned() {
        Employee e = new CommissionedEmployee();
        Assertions.assertEquals(BigDecimal.TEN, e.calculatePay().amount());
        Assertions.assertEquals(BigDecimal.ONE, e.calculateBonus().amount());
    }
}
