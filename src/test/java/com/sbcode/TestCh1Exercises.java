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

    @Test
    void oneOneFour() {
        //'then' is not Java syntax.
        //a > b should be contained in brackets
        //statement is fine
        //c = 0 requires a line termination char
    }

    @Test
    void oneOneFive() {
        assertTrue(pairStrictlyWithinBounds(0.1, 0.9, 0.0, 1.0));
        assertFalse(pairStrictlyWithinBounds(0.0, 1.0, 0.0, 1.0));
    }

    boolean pairStrictlyWithinBounds(double x, double y, double lo, double hi) {
        if (x > lo && x < hi && y > lo && y < hi) {
            return true;
        }

        return false;
    }
}