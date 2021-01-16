package com.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test()
    public void shouldReturnSumWhenTwoNumbersGiven() {
        int a = 10;
        int b = 20;

        int result = calculator.add(a, b);

        assertEquals(30, result);

    }
    @Test()
    public void shouldReturnSumWhenAddO() {
        int a = 10;
        int b = 0;

        int result = calculator.add(a, b);

        assertEquals(10, result);

    }
}
