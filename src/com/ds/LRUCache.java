package com.ds;

import java.util.HashMap;

/**
 * Created by Naveen Kumar .A on 11/25/16.
 */
public class LRUCache {

    class Node{
        int key;
        int value;
        Node next;
        Node pre;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    HashMap<Integer, Node> map = new HashMap<>();
    Node head = null;
    Node end = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            setHead(node);
            return node.value;
        }

        return -1;
    }

    private void remove(Node node){
        if(node == null){
            return;
        }
        if(node.pre != null){
            node.pre.next = node.next;
        }else{
            head = node.next;
        }

        if(node.next != null){
            node.next.pre =node.pre;
        }else{
            end=node.pre;
        }
    }

    private void setHead(Node node){
        node.next = head;
        node.pre = null;

        if(head != null){
            head.pre = node;
        }
        head = node;
        if(end == null){
            end =head;
        }
    }

    public void set(int key, int value){
        if(map.containsKey(key)){

        }

    }

}
