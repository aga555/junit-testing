package com.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = RuntimeException.class)
    public void add() {
        throw new RuntimeException("Ops");
    }
}
