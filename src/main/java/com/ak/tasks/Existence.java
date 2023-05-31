package com.ak.tasks;

import java.util.Arrays;

public class Existence {

    private Existence() {

    }

    public static boolean existsStreamImplementation(int[] ints, int k) {
        return Arrays.stream(ints).anyMatch(r -> r == k);
    }

    public static boolean existsForImplementation(int[] ints, int k) {
        for (int anInt : ints)
            if (anInt == k)
                return true;

        return false;
    }
}
