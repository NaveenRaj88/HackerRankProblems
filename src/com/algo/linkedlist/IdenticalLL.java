package com.algo.linkedlist;

import com.Node;

/**
 * Created by anandran on 1/4/17.
 */
public class IdenticalLL {


    public static boolean isIdentical(Node list1, Node list2){
        while(list1 != null && list2 != null){
            if(list1.data != list2.data){
                return false;
            }
            return isIdentical(list1.next, list2.next);
        }
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> list1 = new Node<>(1);
        list1.next = new Node<>(2);
        list1.next.next = new Node<>(3);
        list1.next.next.next = new Node<>(4);
        list1.next.next.next.next = new Node<>(6);


        Node<Integer> list2 = new Node<>(1);
        list2.next = new Node<>(2);
        list2.next.next = new Node<>(3);
        list2.next.next.next = new Node<>(4);
        list2.next.next.next.next = new Node<>(6);

        System.out.println(isIdentical(list1, list2));

    }
}
