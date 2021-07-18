package com.ds;

public class LinkedList {
    static  class MyNode{
        int data;
        MyNode next;

        public MyNode(int data) {
            this.data = data;
            this.next = null;
        }

    }
    //Represent the head and tail of the linked list
    public MyNode head = null;
    public MyNode tail = null;
    //creating insert method
    public void add(int data) {
        //Creating object as newNode
        MyNode newNode = new MyNode(data);
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            //newNode will be added before head such that head next will point to newNode
            head = newNode;

        }
    }
    //creating print method
    public void print() {
        //Node current will point to head
        MyNode temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list is: ");
        while (temp != null) {
            //Prints each node by incrementing pointer
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
