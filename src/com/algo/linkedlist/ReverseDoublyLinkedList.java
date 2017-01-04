package com.algo.linkedlist;

import com.Node;

/**
 * Created by anandran on 1/4/17.
 */
public class ReverseDoublyLinkedList {

    public static Node reverse(Node root){
        Node temp = root;
        Node newRoot = null;
        while(temp != null){
            Node tempNode = temp;
            temp = temp.next;
            tempNode.next = newRoot;
            if(newRoot != null){
                newRoot.prev = tempNode;
            }
            tempNode.prev = null;
            newRoot = tempNode;
        }
        return newRoot;
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        node.next = new Node<>(2);
        node.next.next = new Node<>(3);
        node.next.next.next = new Node<>(4);
        node.next.next.next.next = new Node<>(5);
        System.out.println(node);
        node = reverse(node);
        System.out.println(node);

    }
}
