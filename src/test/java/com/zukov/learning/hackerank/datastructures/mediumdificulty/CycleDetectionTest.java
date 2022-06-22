package com.zukov.learning.hackerank.datastructures.mediumdificulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycleDetectionTest {

    @Test
    void hasCycle_cycleNotExists() {

        CycleDetection.SinglyLinkedListNode node4 = new CycleDetection.SinglyLinkedListNode(4, null);
        CycleDetection.SinglyLinkedListNode node3 = new CycleDetection.SinglyLinkedListNode(3, node4);
        CycleDetection.SinglyLinkedListNode node2 = new CycleDetection.SinglyLinkedListNode(2, node3);
        CycleDetection.SinglyLinkedListNode node1 = new CycleDetection.SinglyLinkedListNode(1, node2);

        boolean isCycle = CycleDetection.twoPointerAlgo(node1);

        assertFalse(isCycle);
    }

    @Test
    void hasCycle_cycleExists() {

        CycleDetection.SinglyLinkedListNode node6 = new CycleDetection.SinglyLinkedListNode(6, null);
        CycleDetection.SinglyLinkedListNode node5 = new CycleDetection.SinglyLinkedListNode(5, null);
        CycleDetection.SinglyLinkedListNode node4 = new CycleDetection.SinglyLinkedListNode(4, node5);
        CycleDetection.SinglyLinkedListNode node3 = new CycleDetection.SinglyLinkedListNode(3, node4);
        CycleDetection.SinglyLinkedListNode node2 = new CycleDetection.SinglyLinkedListNode(2, node3);
        node5.setNext(node2);
        CycleDetection.SinglyLinkedListNode node1 = new CycleDetection.SinglyLinkedListNode(1, node2);

        boolean isCycle = CycleDetection.twoPointerAlgo(node1);

        assertTrue(isCycle);
    }

    @Test
    void hasCycle_cycleExists2Nodes() {
        CycleDetection.SinglyLinkedListNode node2 = new CycleDetection.SinglyLinkedListNode(2, null);
        CycleDetection.SinglyLinkedListNode node1 = new CycleDetection.SinglyLinkedListNode(1, null);
        node1.setNext(node2);
        node2.setNext(node1);

        boolean isCycle = CycleDetection.twoPointerAlgo(node1);

        assertTrue(isCycle);
    }

    @Test
    void hasCycle_cycleNotExists1Node() {
        CycleDetection.SinglyLinkedListNode node1 = new CycleDetection.SinglyLinkedListNode(1, null);

        boolean isCycle = CycleDetection.twoPointerAlgo(node1);

        assertFalse(isCycle);
    }
}