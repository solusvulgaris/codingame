package com.ak.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * Counts the number of pairs for n players.
 */
class PairsTest {

    public static Stream<Arguments> pairsTestData() {
        return Stream.of(
                Arguments.of(4, 6),
                Arguments.of(10000, 49995000)
        );
    }

    @ParameterizedTest
    @MethodSource("pairsTestData")
    @DisplayName("pair test")
    void pairsTest(int count, int result) {
        Assertions.assertEquals(result, Pairs.count(count));
    }
}
