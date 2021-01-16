package com.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test()
    public void add() {
        int a = 10;
        int b = 20;
        int result = Calculator.add(a, b);
        assertEquals(30, result);

    }
}
