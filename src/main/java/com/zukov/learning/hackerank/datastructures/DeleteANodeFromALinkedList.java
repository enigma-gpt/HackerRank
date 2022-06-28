package com.zukov.learning.hackerank.datastructures;

import com.zukov.learning.hackerank.datastructures.util.SinglyLinkedListNode;

public class DeleteANodeFromALinkedList {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here

        if(position == 0) {
            return llist.next;
        }

        SinglyLinkedListNode currentNode = llist;
        SinglyLinkedListNode prevNode = null;
        int index = 0;
        while(currentNode != null) {
            if(index == position - 1) {
                prevNode = currentNode;
            }
            if(index == position + 1) {
                break;
            }

            currentNode = currentNode.next;
            index++;
        }
        prevNode.next = currentNode;
        return llist;
    }
}
