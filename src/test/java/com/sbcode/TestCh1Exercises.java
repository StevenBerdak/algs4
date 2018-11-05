package com.sbcode;

import com.sbcode.exercises.OneOneSix;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SuppressWarnings("ALL")
public class TestCh1Exercises {

    @Test
    public void oneOneOne() {
        assertEquals((0 + 15) / 2, 7);
        assertEquals(2.0e-6 * 100000000.1, 200.0000002);
        assertTrue(true && false || true && true);
    }

    @Test
    public void oneOneTwo() {
        assertEquals((1 + 2.236) / 2, 1.618);
        assertEquals(1 + 2 + 3 + 4.0, 10.0);
        Assertions.assertTrue(4.1 >= 4);

        // 1 + 2 + "3" = "not a statement"
    }

    @Test
    public void oneOneThree() {
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
    public void oneOneFour() {
        // 'then' is not Java syntax.
        // a > b should be contained in brackets
        // statement is fine
        // c = 0 requires a line termination char
    }

    @Test
    public void oneOneFive() {
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
    public void oneOneSix() {
        ArrayList<Integer> expectedResults = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
                144, 233, 377, 610));

        ArrayList<Integer> results = OneOneSix.getResults();

        for (int i = 0; i < expectedResults.size(); i++) {
            assertTrue(expectedResults.get(i).equals(results.get(i)));
        }
    }

    @Test
    public void oneOneSeven() {
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
    public void oneOneEight() {
        assertEquals('b', 'b');
        assertEquals('b' + 'c', 197);
        assertEquals((char) ('a' + 4), 'e');
    }

    @Test
    public void oneOneNine() {
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
    public void oneOneTen() {
        // int[] a;
        // for (int i = 0; i < 10; i++) {
        //     a[i] = i * i;
        // }

        // 'Variable a might not have been initialized'
    }

    @Test
    public void oneOneEleven() {
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
    public void oneOneTwelve() {
        assertEquals(Arrays.toString(provideOneOneTwelveArray()),
                Arrays.toString(new int[]{0, 1, 2, 3, 4, 4, 3, 2, 1, 0}));
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
    public void oneOneThirteen() {
        int[][] testMatrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] testTransposition = new int[][]{
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

    @Test
    public void oneOneFourteen() {
        assertEquals(lg(2), 1);
        assertEquals(lg(4), 2);
        assertEquals(lg(16), 4);
        assertEquals(lg(20), 4);
    }

    static int lg(int n) {
        if (n < 2) {
            return 0;
        }

        int log = 1;
        int temp = 2;

        while (temp * 2 <= n) {
            temp = 2;
            for (int i = 0; i < log; i++) {
                temp *= 2;
            }
            log++;
        }

        return log;
    }

    @Test
    public void oneOneFifteen() {
        int[] arguments = new int[]{1, 3, 1, 3, 7, 5, 0, 16, 21, 5, 42};

        assertTrue(Arrays.equals(histogram(arguments, 5), new int[]{1, 2, 0, 2, 0}));
    }

    static int[] histogram(int[] a, int m) {
        int[] result = new int[m];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < result.length) {
                result[a[i]]++;
            }
        }

        return result;
    }

    @Test
    public void oneOneSixteen() {
        assertEquals(exR1(6), "311361142246");
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    @Test(expected = StackOverflowError.class)
    public void oneOneSeventeen() {
        exR2(3);
    }

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }

    @Test
    public void oneOneEighteen() {
        assertEquals(mystery(2, 25), 50);
        assertEquals(mystery(3, 11), 33);
        // The mystery method returns b multiplied by a.
        assertEquals(mystery2(2, 25), 33554432);
        assertEquals(mystery2(3, 11), 177147);
        // The mystery2 method returns a to the power of b.
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a * a, b / 2);
        return mystery2(a * a, b / 2) * a;
    }

    @Test
    public void oneOneNineteen() {
        // Profiling completion times for each iteration shows that for my machin each iteration takes approximately
        // 1.6 times longer than the last iteration. Iteration 54 took 550559 ms to complete.
        // One hour represeted in milliseconds is 3,600,600 ms.
        //
        // At this rate Iteration 57 will take approx. 2,255,089 ms to complete
        // Iteration 58 will take approx. 3,608,143 ms to complete which is very close to 1 hour.
        //
        // Iteration 57 is the last iteration on my machine that will most likely complete in less than 1 hour.

        long fibResultI9 = fibonacci(9);
        assertEquals(fibResultI9, 34);

        long improvedFibResultI0 = fibonacciImproved(0);
        assertEquals(improvedFibResultI0, 0);

        long improvedFibResultI1 = fibonacciImproved(1);
        assertEquals(improvedFibResultI1, 1);

        long improvedFibResultI2 = fibonacciImproved(2);
        assertEquals(improvedFibResultI2, 1);

        long improvedFibResultI9 = fibonacciImproved(9);
        assertEquals(improvedFibResultI9, 34);

        long improvedFibResultI90 = fibonacciImproved(90);
        assertEquals(improvedFibResultI90, 2880067194370816120L);
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacciImproved(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        n++;

        long[] a = new long[n];

        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }

        return a[a.length - 1];
    }

    @Test
    public void oneOneTwenty() {
        int factorialOfOne = ln(1);
        assertEquals(factorialOfOne, 1);

        int factorialOfFive = ln(5);
        assertEquals(factorialOfFive, 120);
    }

    static int ln(int factorial) {
        if (factorial == 1) return 1;
        return factorial * ln(factorial - 1);
    }

    @Test
    public void oneOneTwentyOne() {
        createPercentTable(new String[]
                {
                        "Johhny Legend, .3550, .3770",
                        "Megan Mahoney, .5565, .4444",
                        "Bobby Pin, .5544, .0"
                }
        );
    }

    /**
     * Input a String array with a name and two numbers that are of type double for each entry. The resulting table
     * will display the percent differnce of the second number by the first.
     *
     * @param inputStrings An array of Strings containing a name and two doubles.
     * @return True if all the input Strings were parsed properly, otherwise false.
     */
    boolean createPercentTable(String[] inputStrings) {
        try {
            String result = "_Name_______|__Average____";

            for (String inputString : inputStrings) {
                System.out.print("Enter a name and two numbers separated by commas (<name>, <num1>, <num2>): ");
                Scanner scanner = new Scanner(inputString);
                String input = scanner.nextLine();
                System.out.println(input);

                String[] tokens = input.split(",");

                if (tokens.length > 3 || tokens.length < 3) {
                    throw new InvalidParameterException("Input was not formatted properly");
                }

                String name = tokens[0];

                if (name.length() == 0) {
                    throw new InvalidParameterException("Name could not be parsed");
                }

                double numA = Double.MIN_VALUE, numB = Double.MAX_VALUE;

                numA = Double.parseDouble(tokens[1]);
                numB = Double.parseDouble(tokens[2]);

                if (name.length() > 10) {
                    name = name.substring(0, 10);
                } else {
                    while (name.length() < 10) {
                        name += " ";
                    }
                }

                result += String.format("\n%s  |  %s", name, Double.toString(divideBOverA(numA, numB)));
            }

            StdOut.printf(result);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    double divideBOverA(double a, double b) {
        return b / a;
    }
}