package com.sbcode.exercises;

import java.util.ArrayList;

public class OneOneSix {

    public static ArrayList<Integer> getResults() {
        ArrayList<Integer> result = new ArrayList<>();

        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
            result.add(f);
            f = f + g;
            g = f - g;
        }

        return result;
    }
}
