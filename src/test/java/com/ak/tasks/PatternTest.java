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
                Arguments.of(4, 4, "1.0"),
                Arguments.of(5, 0, "1.0"),
                Arguments.of(5, 1, "5.0"),
                Arguments.of(8, 1, "8.0"),
                Arguments.of(30, 30, "1.0"),
                Arguments.of(7, 6, "7.0"),
                Arguments.of(47, 46, "47.0"),
                Arguments.of(4, 2, "6.0"),
                Arguments.of(6, 2, "15.0"),
                Arguments.of(4, 3, "4.0"),
                Arguments.of(5, 3, "10.0"),
                Arguments.of(6, 3, "20.0"),
                Arguments.of(7, 3, "35.0"),
                Arguments.of(5, 4, "5.0"),
                Arguments.of(6, 4, "15.0"),
                Arguments.of(8, 5, "56.0"),
                Arguments.of(8, 6, "28.0"),
                Arguments.of(9, 4, "126.0")
                //Arguments.of(67, 34, "14226520737620288370")
        );
    }

    @ParameterizedTest
    @MethodSource("patternTestData")
    @DisplayName("pattern test")
    void patternTest(int l, int c, String result) {
        Assertions.assertEquals(result, Pattern.get(l, c));
    }
}
