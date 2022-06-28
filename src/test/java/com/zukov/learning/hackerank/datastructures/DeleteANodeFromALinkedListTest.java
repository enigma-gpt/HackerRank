package com.zukov.learning.hackerank.datastructures;

import com.zukov.learning.hackerank.datastructures.util.SinglyLinkedListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DeleteANodeFromALinkedListTest {

    @Test
    void deleteNode() {

        SinglyLinkedListNode head = new SinglyLinkedListNode(1, null);

        SinglyLinkedListNode singlyLinkedListNode = DeleteANodeFromALinkedList.deleteNode(head, 0);

        assertNull(singlyLinkedListNode);
    }

    @Test
    void deleteNode2() {

        SinglyLinkedListNode node6 = new SinglyLinkedListNode(6, null);
        SinglyLinkedListNode node5 = new SinglyLinkedListNode(5, node6);
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(4, node5);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(3, node4);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, node3);
        SinglyLinkedListNode head = new SinglyLinkedListNode(1, node2);

        SinglyLinkedListNode singlyLinkedListNode = DeleteANodeFromALinkedList.deleteNode(head, 2);

        assertThat(retrieveNodeWithPosition(singlyLinkedListNode, 0).data).isEqualTo(1);
        assertThat(retrieveNodeWithPosition(singlyLinkedListNode, 1).data).isEqualTo(2);
        assertThat(retrieveNodeWithPosition(singlyLinkedListNode, 2).data).isEqualTo(4);
        assertThat(retrieveNodeWithPosition(singlyLinkedListNode, 3).data).isEqualTo(5);
        assertThat(retrieveNodeWithPosition(singlyLinkedListNode, 4).data).isEqualTo(6);
    }

    @Test
    void deleteNode3() {

        SinglyLinkedListNode node2 = new SinglyLinkedListNode(2, null);
        SinglyLinkedListNode head = new SinglyLinkedListNode(1, node2);

        SinglyLinkedListNode singlyLinkedListNode = DeleteANodeFromALinkedList.deleteNode(head, 1);

        assertThat(retrieveNodeWithPosition(singlyLinkedListNode, 0).data).isEqualTo(1);
        assertThat(retrieveNodeWithPosition(singlyLinkedListNode, 1)).isNull();
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