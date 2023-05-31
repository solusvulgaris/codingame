package com.ak.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PatternTest {

    public static Stream<Arguments> patternTestData() {
        return Stream.of(
                Arguments.of(3, 5, ""),
                Arguments.of(4, 4, "1"),
                Arguments.of(5, 0, "1"),
                Arguments.of(5, 1, "5"),
                Arguments.of(8, 1, "8"),
                Arguments.of(30, 30, "1"),
                Arguments.of(7, 6, "7"),
                Arguments.of(47, 46, "47")
            //    Arguments.of(4, 2, "6"),
            //    Arguments.of(5, 4, "5"),
            //    Arguments.of(67, 34, "14226520737620288370")
        );
    }

    @ParameterizedTest
    @MethodSource("patternTestData")
    @DisplayName("pattern test")
    void patternTest(int l, int c, String result) {
        Assertions.assertEquals(result, Pattern.get(l, c));
    }
}
