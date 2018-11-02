package com.sbcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SuppressWarnings("ALL")
class TestCh1Exercises {

    @Test
    void oneOneOne() {
        assertEquals((0 + 15) / 2, 7);
        assertEquals(2.0e-6 * 100000000.1, 200.0000002);
        assertTrue(true && false || true && true);
    }

    @Test
    void oneOneTwo() {
        assertEquals((1 + 2.236) / 2,1.618);
        assertEquals(1 + 2 + 3 + 4.0, 10.0);
        Assertions.assertTrue(4.1 >= 4);
        //1 + 2 + "3" = "not a statement"
    }

    @Test
    void oneOneThree() {
        assertTrue(areAllEqual(1, 1, 1));
        assertFalse(areAllEqual(1, 2, 3));
    }

    boolean areAllEqual(int a, int b, int c) {
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }


}