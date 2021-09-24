package com.zukov.learning.hackerank.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalTest {

    @Test
    void preOrder() {

        final var root = new PreorderTraversal.Node(1);
        PreorderTraversal.Node node2 = new PreorderTraversal.Node(2);
        root.right = node2;

        PreorderTraversal.Node node3 = new PreorderTraversal.Node(5);
        node2.right = node3;

        PreorderTraversal.Node node4 = new PreorderTraversal.Node(3);
        node3.left = node4;
        node3.right = new PreorderTraversal.Node(6);

        node4.right = new PreorderTraversal.Node(4);

        PreorderTraversal.preOrder(root);


    }
}