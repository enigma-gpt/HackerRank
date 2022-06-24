package com.zukov.learning.hackerank.datastructures;

import com.zukov.learning.hackerank.datastructures.util.SinglyLinkedListNode;

public class InsertNodeAtASpecificPositionInALinkedList {

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here

        if(llist == null)
            return new SinglyLinkedListNode(data);

        SinglyLinkedListNode beforeNode = null;
        SinglyLinkedListNode currentNode = llist;
        int index = 0;
        while(currentNode != null) {
            if(index >= position) {
               break;
            }
            beforeNode = currentNode;
            currentNode = currentNode.next;
            index++;
        }

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = currentNode;
        if (beforeNode != null) {
            beforeNode.next = newNode;
        } else {
            llist = newNode;
        }

        return llist;
    }
}
