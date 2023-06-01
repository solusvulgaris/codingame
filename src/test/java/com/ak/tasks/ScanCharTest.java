package com.ak.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ScanCharTest {

    @Test
    @DisplayName("Existence test for for loop implementation")
    void scanCharTest() {
        Assertions.assertEquals(65, ScanChar.scanChar("A"));
    }
}
