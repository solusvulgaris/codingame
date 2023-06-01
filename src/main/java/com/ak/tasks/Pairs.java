package com.ak.tasks;

public class Pairs {

    private Pairs() {

    }

    /**
     * Counts the number of pairs for n players.
     */
    public static int count(int n) {
        int result = 0;
        for (int i = 0; i < n; ++i) {
            result += i;
        }
        return result;
    }
}
