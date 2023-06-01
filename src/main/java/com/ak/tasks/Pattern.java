package com.ak.tasks;

/*
       c
*         0   1   2   3   4   5   6   7   8  9
*  l 0    1
*    1    1   1
*    2    1   2   1
*    3    1   3   3   1
*    4    1   4   6   4   1
*    5    1   5   10  10  5   1
*    6    1   6   15  20  15  6   1
*    7    1   7   21  35  35  21  7   1
*    8    1   8   28  56  70  56  28  8  1
*    9    1   9   36  84  126 126 84  36 9  1
* */
public class Pattern {

    private Pattern() {
    }

    public static String get(int l, int c) {
        double d = 0;
        if (l < c) return "";//just in case
        if (c == l) return "1";
        if (c == 0) return "1";
        if (c == 1 || c == (l - 1)) return String.valueOf(l);

        return Double.toString(d);
    }
}
