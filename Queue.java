package com.ds;

public class Queue {
    //Creating object for linkedList class
    LinkedList list=new LinkedList();
    //Creating enQueue() to insert the elements
    public void enQueue(int data){
        list.appendNode(data);
    }
    //Creating printQueue() to Display list
    public void printQueue(){
        list.print();
    }
    //Creating peek() to show the top of element
    public int peek() {
        return list.head.data;
    }
    //Creating deQueue() to delete the elements
    public void deQueue(){
        list.popAtFirst();
    }
}

