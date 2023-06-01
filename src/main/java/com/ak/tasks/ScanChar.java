package com.ak.tasks;

public class ScanChar {

    private ScanChar() {

    }

    public static String getString(char value) {
        return String.valueOf(value);
    }

    public static char scanChar(String s) {
        return s.charAt(0);
    }
}
