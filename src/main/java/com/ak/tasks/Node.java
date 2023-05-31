package com.ak.tasks;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private Node left = null;
    private Node right = null;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node find(int v) {
        return findRec(this, v);
    }

    protected static Node findRec(Node n, int v) {
        if (n == null) return null;
        if (v == n.value) return n;
        return (v > n.value) ? findRec(n.right, v) : findRec(n.left, v);
    }
}
