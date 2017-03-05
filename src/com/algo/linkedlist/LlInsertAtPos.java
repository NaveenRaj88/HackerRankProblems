package com.algo.linkedlist;

import com.Node;

/**
 * Created by anandran on 3/3/17.
 */
public class LlInsertAtPos
{

    public static Node insert(Node head, int data , int position){

        if(head == null){
            head = new Node();
            head.data = data;
            return head;
        }
        Node posNode = head;
        while(--position != 0){
            posNode = posNode.next;
        }
        Node node = new Node();
        node.data = data;
        node.next = posNode.next;
        posNode.next = node;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 3,0);
        head = insert(head, 5,1);
        head = insert(head, 4,2);
        head = insert(head, 2,3);
        head = insert(head, 10,1);

        while(head!=null){
            System.out.print(head.data);
            head = head.next;
        }
    }
}
