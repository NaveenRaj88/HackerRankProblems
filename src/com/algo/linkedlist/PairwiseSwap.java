package com.algo.linkedlist;

import com.Node;

/**
 * Created by anandran on 1/3/17.
 */
public class PairwiseSwap {

    private static void swapListPairwise(Node root){
        Node temp = root;
        while(temp  != null & temp.next != null){
            Object tempData = temp.next.data;
            temp.next.data= temp.data;
            temp.data = tempData;
            temp = temp.next.next;
        }
    }


    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        node.next = new Node<>(2);
        node.next.next = new Node<>(3);
        node.next.next.next = new Node<>(4);
        node.next.next.next.next = new Node<>(5);
        System.out.println(node);
        swapListPairwise(node);
        System.out.println(node);

    }
}
