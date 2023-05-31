package com.ak.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ExistenceTest {

    public static Stream<org.junit.jupiter.params.provider.Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{-9, 14, 37, 102}, 102, true, "Value exists."),
                Arguments.of(new int[]{1, -28, 88, 200, 7}, 36, false, "Value does not exist.")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    @DisplayName("Existence test")
    void existenceForImplementationTest(int[] ints, int value, boolean exists, String description) {
        Assertions.assertEquals(exists, Existence.existsForImplementation(ints, value), description);
    }

    @ParameterizedTest
    @MethodSource("testData")
    @DisplayName("Existence test")
    void existenceStreamImplementationTest(int[] ints, int value, boolean exists, String description) {
        Assertions.assertEquals(exists, Existence.existsStreamImplementation(ints, value), description);
    }

}
