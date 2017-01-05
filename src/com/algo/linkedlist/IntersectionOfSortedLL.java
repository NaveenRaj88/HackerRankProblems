package com.algo.linkedlist;

import com.Node;

/**
 * Created by anandran on 1/4/17.
 */
public class IntersectionOfSortedLL {

    public static Node intersection(Node node1, Node node2){
        Node newRoot = null;
        Node tail = null;
        while(node1 != null && node2 != null){
            if(node1.data == node2.data){
                Node tempNode = node1;
                node2 = node2.next;
                node1 = node1.next;
                tempNode.next= null;
                if(newRoot == null) {
                    newRoot = tempNode;
                    tail = newRoot;
                }else{
                    tail.next = tempNode;
                    tail = tail.next;
                }

            }else if((int) node1.data < (int) node2.data){
                node1 = node1.next;
            }else{
                node2 = node2.next;
            }
        }
        return newRoot;
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        node1.next = new Node<>(2);
        node1.next.next = new Node<>(3);
        node1.next.next.next = new Node<>(4);
        node1.next.next.next.next = new Node<>(6);


        Node<Integer> node2 = new Node<>(2);
        node2.next = new Node<>(4);
        node2.next.next = new Node<>(6);
        node2.next.next.next = new Node<>(8);

        System.out.println(node1 +"  "+node2);
        Node node = intersection(node1, node2);
        System.out.println(node);
    }
}
