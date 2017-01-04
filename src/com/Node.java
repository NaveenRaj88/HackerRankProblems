package com;

/**
 * Created by anandran on 1/3/17.
 */
public class Node<E> {

    public E data;
    public Node<E> next;
    public Node<E> prev;

    public Node(){

    }

    public Node(E data){
        this.data = data;
    }

    @Override
    public String toString() {
        Node temp = this;
        String s = "";
        while(temp != null){
            s+=" "+temp.data;
            temp = temp.next;
        }
        return s;
    }
}
