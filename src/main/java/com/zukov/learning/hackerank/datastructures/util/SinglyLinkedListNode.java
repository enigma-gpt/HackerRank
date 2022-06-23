package com.zukov.learning.hackerank.datastructures.util;

public class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public SinglyLinkedListNode(int data) {
        this.data = data;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }
}
