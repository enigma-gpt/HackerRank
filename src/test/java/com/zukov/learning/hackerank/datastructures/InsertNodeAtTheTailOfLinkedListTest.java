package com.zukov.learning.hackerank.datastructures;

import com.zukov.learning.hackerank.datastructures.util.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InsertNodeAtTheTailOfLinkedListTest {

    @Test
    void insertNodeAtTail0() {

        SinglyLinkedListNode newHead = InsertNodeAtTheTailOfLinkedList.insertNodeAtTail(null, 1);

        SinglyLinkedListNode tailNode = retrieveTailNode(newHead);
        assertThat(tailNode.data).isEqualTo(1);
    }

    @Test
    void insertNodeAtTail1() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(1, null);

        SinglyLinkedListNode newHead = InsertNodeAtTheTailOfLinkedList.insertNodeAtTail(head, 2);

        SinglyLinkedListNode tailNode = retrieveTailNode(newHead);
        assertThat(tailNode.data).isEqualTo(2);
    }

    @Test
    void insertNodeAtTail2() {
        SinglyLinkedListNode node6 = new SinglyLinkedListNode(6, null);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(5, node6);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4, node5);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3, node4);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, node3);
        SinglyLinkedListNode head = new SinglyLinkedListNode(1, node2);

        SinglyLinkedListNode newHead = InsertNodeAtTheTailOfLinkedList.insertNodeAtTail(head, 7);

        SinglyLinkedListNode tailNode = retrieveTailNode(newHead);
        assertThat(tailNode.data).isEqualTo(7);
    }

    private SinglyLinkedListNode retrieveTailNode(SinglyLinkedListNode head) {
        SinglyLinkedListNode currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}