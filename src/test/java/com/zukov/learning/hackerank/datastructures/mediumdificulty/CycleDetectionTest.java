package com.zukov.learning.hackerank.datastructures.mediumdificulty;

import com.zukov.learning.hackerank.datastructures.util.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static com.zukov.learning.hackerank.datastructures.mediumdificulty.CycleDetection.twoPointerAlgo;
import static org.junit.jupiter.api.Assertions.*;

class CycleDetectionTest {

    @Test
    void hasCycle_cycleNotExists() {

        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4, null);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3, node4);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, node3);
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1, node2);

        boolean isCycle = twoPointerAlgo(node1);

        assertFalse(isCycle);
    }

    @Test
    void hasCycle_cycleExists() {

        SinglyLinkedListNode node6 = new SinglyLinkedListNode(6, null);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(5, null);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4, node5);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3, node4);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, node3);
        node5.setNext(node2);
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1, node2);

        boolean isCycle = twoPointerAlgo(node1);

        assertTrue(isCycle);
    }

    @Test
    void hasCycle_cycleExists2Nodes() {
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, null);
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1, null);
        node1.setNext(node2);
        node2.setNext(node1);

        boolean isCycle = twoPointerAlgo(node1);

        assertTrue(isCycle);
    }

    @Test
    void hasCycle_cycleNotExists1Node() {
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1, null);

        boolean isCycle = twoPointerAlgo(node1);

        assertFalse(isCycle);
    }
}