package com.ak;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * App start point
 */
public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Entry point of codingame application.");
    }
}
