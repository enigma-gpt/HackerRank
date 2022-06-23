package com.zukov.learning.hackerank.datastructures;

import com.zukov.learning.hackerank.datastructures.util.SinglyLinkedListNode;

public class InsertNodeAtTheTailOfLinkedList {

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode tail = fetchTail(head);
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (tail == null) {
            return newNode;
        }
        tail.next = newNode;
        return head;
    }

    private static SinglyLinkedListNode fetchTail(SinglyLinkedListNode currentNode) {
        if (currentNode == null){
            return null;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}
