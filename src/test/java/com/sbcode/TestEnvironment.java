package com.sbcode;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

class TestEnvironment {

    @Test
    void integerMinValueTest() {
        int n = Math.abs(-2147483648);
        System.out.println("integerMinValueTest = " + n);
        assertEquals(n, Integer.MIN_VALUE);
    }

    @Test
    void initializeDoubleToInifinityTest() {
        double d = Double.POSITIVE_INFINITY;
        System.out.println("initializeDoubleToInifinityTest = " + d);
        assertEquals(d, Double.POSITIVE_INFINITY);
    }

    @SuppressWarnings({"NumericOverflow", "divzero"})
    @Test
    void divideDoubleByZeroTest() {
        double d = 1.0/0.0;
        System.out.println("divideDoubleByZeroTest = " + d);
        assertEquals(d, Double.POSITIVE_INFINITY);
    }
}
