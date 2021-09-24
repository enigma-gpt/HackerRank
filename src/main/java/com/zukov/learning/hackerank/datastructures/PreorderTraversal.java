package com.zukov.learning.hackerank.datastructures;

public class PreorderTraversal {

   /* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(Node root) {
        traverse(root);
    }

    private static void traverse(Node node) {
        System.out.print(node.data + " ");

        if (node.left != null) {
            traverse(node.left);
        }
        if(node.right != null) {
            traverse(node.right);
        }
    }

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

}
