package com.zukov.learning.hackerank.datastructures;

import com.zukov.learning.hackerank.datastructures.util.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InsertNodeAtASpecificPositionInALinkedListTest {

    @Test
    void insertNodeAtSpecificPosition0() {

        SinglyLinkedListNode newHead = InsertNodeAtASpecificPositionInALinkedList.insertNodeAtPosition(null, 1, 0);

        assertThat(newHead.data).isEqualTo(1);
    }

    @Test
    void insertNodeAtSpecificPosition1() {
        SinglyLinkedListNode head = new SinglyLinkedListNode(2, null);

        SinglyLinkedListNode newHead = InsertNodeAtASpecificPositionInALinkedList.insertNodeAtPosition(head, 1,0);

        SinglyLinkedListNode node = retrieveNodeWithPosition(newHead,1);
        assertThat(node.data).isEqualTo(2);
    }

    @Test
    void insertNodeAtSpecificPosition2() {
        SinglyLinkedListNode node6 = new SinglyLinkedListNode(6, null);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(5, node6);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4, node5);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3, node4);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, node3);
        SinglyLinkedListNode head = new SinglyLinkedListNode(1, node2);

        SinglyLinkedListNode newHead = InsertNodeAtASpecificPositionInALinkedList.insertNodeAtPosition(head, 7, 4);

        SinglyLinkedListNode node = retrieveNodeWithPosition(newHead, 4);
        assertThat(node.data).isEqualTo(7);
    }

    private SinglyLinkedListNode retrieveNodeWithPosition(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode currentNode = head;
        int index = 0;
        while(currentNode != null) {
            if (position == index) {
                return currentNode;
            }
            currentNode = currentNode.next;
            index++;
        }
        return null;
    }
}