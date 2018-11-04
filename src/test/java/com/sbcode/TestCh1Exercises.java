package com.sbcode;

import com.sbcode.exercises.OneOneSix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
        assertEquals((1 + 2.236) / 2, 1.618);
        assertEquals(1 + 2 + 3 + 4.0, 10.0);
        Assertions.assertTrue(4.1 >= 4);

        // 1 + 2 + "3" = "not a statement"
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
        // 'then' is not Java syntax.
        // a > b should be contained in brackets
        // statement is fine
        // c = 0 requires a line termination char
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

    @Test
    void oneOneSix() {
        ArrayList<Integer> expectedResults = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
                144, 233, 377, 610));

        ArrayList<Integer> results = OneOneSix.getResults();

        for (int i = 0; i < expectedResults.size(); i++) {
            assertTrue(expectedResults.get(i).equals(results.get(i)));
        }
    }

    @Test
    void oneOneSeven() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.001) {
            t = (9.0 / t + t) / 2.0;
        }
        assertEquals(String.format("%.5f", t), "3.00009");

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        assertEquals(sum, 499500);

        sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }

        assertEquals(sum, 10000);
    }

    @Test
    void oneOneEight() {
        assertEquals('b', 'b');
        assertEquals('b' + 'c', 197);
        assertEquals((char) ('a' + 4), 'e');
    }

    @Test
    void oneOneNine() {
        assertEquals(intToBinaryString(21), "10101");
        assertEquals(intToBinaryString(7), "111");
    }

    String intToBinaryString(int n) {
        String result = "";

        while (n > 0) {
            result = (n % 2) + result;

            n /= 2;
        }

        return result;
    }

    @Test
    void oneOneTen() {
        // int[] a;
        // for (int i = 0; i < 10; i++) {
        //     a[i] = i * i;
        // }

        // 'Variable a might not have been initialized'
    }

    @Test
    void oneOneEleven() {
        assertEquals(string2DBooleanArray(new boolean[][]
                {
                        {true, false, true},
                        {false, true, false},
                        {true, false, true}
                }),
                "[*][ ][*]\n[ ][*][ ]\n[*][ ][*]\n");
    }

    String string2DBooleanArray(boolean[][] array) {
        String result = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == true) {
                    result += "[*]";
                } else {
                    result += "[ ]";
                }
            }
            result += "\n";
        }

        return result;
    }

    @Test
    void oneOneTwelve() {
        assertEquals(Arrays.toString(provideOneOneTwelveArray()),
                Arrays.toString(new int[] {0, 1, 2, 3, 4, 4, 3, 2, 1, 0}));
    }

    int[] provideOneOneTwelveArray() {
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        return a;
    }

    @Test
    void oneOneThirteen() {
        int[][] testMatrix = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] testTransposition = new int[][] {
                {1, 5, 9},
                {2, 6, 10},
                {3, 7, 11},
                {4, 8, 12}
        };

        assertEquals(Arrays.deepToString(transpositionOfAMatrix(testMatrix)), Arrays.deepToString(testTransposition));
    }

    int[][] transpositionOfAMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}