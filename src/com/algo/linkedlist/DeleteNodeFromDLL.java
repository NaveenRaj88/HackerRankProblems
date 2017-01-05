package com.algo.linkedlist;

import com.Node;

/**
 * Created by anandran on 1/4/17.
 */
public class DeleteNodeFromDLL {

    public static Node deleteNode(Node root, Node del){
        Node head = root;
        if(root == null || del == null){
            return root;
        }
        if(del == root){
            root = root.next;
            if(root != null) {
                root.prev = null;
            }
            return root;
        }
        while(root.next != null){
            if(root.next == del){
                Node temp = root.next;
                root.next.next.prev = root;
                root.next = root.next.next;
                temp.next = null;
                temp.prev = null;
            }
            root = root.next;
        }
        return head;
    }


    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        node.next = new Node<>(2);
        node.next.next = new Node<>(3);
        node.next.next.next = new Node<>(4);
        node.next.next.next.next = new Node<>(5);
        System.out.println(node);
        node = deleteNode(node, node.next);
        System.out.println(node);

    }
}
