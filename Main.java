package com.ds;

public class Main {
    public static void main(String[] args) {
        Stack myStack=new Stack();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        myStack.printStack();
        System.out.println("Top  of the element is "+ myStack.peek());
    }
}
