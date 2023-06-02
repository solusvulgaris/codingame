package com.ak.tasks;

/* треугольная матрица
       c
*         0   1   2    3   4    5   6   7   8  9
*  l 0    1                                        1
*    1    1   1                                    1
*    2    1   2   1                                2
*    3    1   3   3    1                           2
*    4    1   4   6    4   1                       3     l==4      4*1+(1*2)     = 6   | 1
*    5    1   5   10   10  5    1                  3 рз  l==5      5*(1*2)       = 10
*    6    1   6   15   20  15   6   1              4 рз  l==6      6*2,5+(2,5*2) = 20  | 2,5
*    7    1   7   21   35  35   21  7   1          4 рз  l==7      7*(2,5*2)     = 35
              7*1 7*3  7*5
*    8    1   8   28   56  70   56  28  8  1       5 рз  l==8      8*7+(7*2)     = 70  | 7
               8*3+8/2 8*7
*    9    1   9   36   84  126  126 84  36 9  1    5 рз  l==9      9*(7*2)       = 126
*    10   1   10  45   120 210  252                6 рз  l==10     10*x+(x*2)         | 21
*    11   1   11  55   165 330  462 462            6 рз  l==11     11*(x*2), x=21=7*3
*    12                         792 924            7 рз  l==12
*    13                             1716           7 рз  l==13     13*(x*2),   x=66   | 66
     l    0       9*4      9*14 l/2 или округление до меньшего целого

     if (l/2) -> max - чет, остаток от деления == 0
     if((l-1)/2) -> max - нечет, остаток от деления
* */
public class Pattern {

    private Pattern() {

    }

    protected static double getDouble(int l, int c) {
        double result = 0;
        if (l < c) return -1;//just in case
        if (c == 0 || c == l) return 1;
        if (c == 1 || c == (l - 1)) return l;
        if (c == 2) {
            int diff = l - 2;//c==2 -2
            int t = 1;
            for (int i = 0; i <= diff; ++i) {
                result += t;
                t++;
            }
            return result;
        }
        if (c >= 3) {
            double f = Pattern.getDouble(l - 1, c - 1);
            double second = Pattern.getDouble(l - 1, c);
            return (f + second);
        }
        return result;
    }

    public static String get(int l, int c) {
        double d = Pattern.getDouble(l, c); //TODO: cut the tail
        if (d < 0) return "";//just in case
        return Double.toString(d);
    }
}
