package com.ak.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveReversedTest {
    public static Stream<Arguments> removeReversedTestData() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(Arrays.asList("loop", "hello", "time", "smart", "world", "smart")),
                        new ArrayList<>(Arrays.asList("pool", "emit", "aloha", "emit", "trams")),
                        new ArrayList<>(Arrays.asList("hello", "world")),
                        new ArrayList<>(List.of("aloha"))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("removeReversedTestData")
    @DisplayName("Remove Reversed test")
    void removeReversedTest(List<String> listA, List<String> listB, List<String> resultA, List<String> resultB) {
        RemoveReversed.removeReversed(listA, listB);
        Assertions.assertEquals(listA, resultA);
        Assertions.assertEquals(listB, resultB);
    }

    @ParameterizedTest
    @MethodSource("removeReversedTestData")
    @DisplayName("Remove Reversed Stream test")
    void removeReversedStreamTest(List<String> listA, List<String> listB, List<String> resultA, List<String> resultB) {
        RemoveReversed.removeReversedStream(listA, listB);
        Assertions.assertEquals(listA, resultA);
        Assertions.assertEquals(listB, resultB);
    }

}
