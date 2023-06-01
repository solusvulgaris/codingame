package com.ak.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NodeTest {
    static Node rootNodeL0;

    @BeforeAll
    static void setUpAll() {
        rootNodeL0 = new Node(9);

        Node leftNodeL1 = new Node(7);
        Node rightNodeL1 = new Node(13);
        rootNodeL0.setLeft(leftNodeL1);
        rootNodeL0.setRight(rightNodeL1);

        Node leftNodeL2L = new Node(5);
        Node rightNodeL2L = new Node(8);
        leftNodeL1.setLeft(leftNodeL2L);
        leftNodeL1.setRight(rightNodeL2L);

        Node rightNodeL2R = new Node(17);
        rightNodeL1.setRight(rightNodeL2R);

        Node leftNodeL3L = new Node(2);
        Node rightNodeL3L = new Node(6);
        leftNodeL2L.setLeft(leftNodeL3L);
        leftNodeL2L.setRight(rightNodeL3L);

        Node leftNodeL3R = new Node(16);
        rightNodeL2R.setLeft(leftNodeL3R);
    }

    @Test
    @DisplayName("Remove Reversed Stream test")
    void removeReversedStreamTest() {
        Assertions.assertEquals(8, rootNodeL0.find(8).getValue());
    }
}
