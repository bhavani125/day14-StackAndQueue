package com.ds;

public class Stack {
    LinkedList list=new LinkedList();

    public void push(int data){
        list.add(data);
    }
    public void printStack(){
        list.print();
    }

    public int peek() {
        return list.head.data;
    }
}
