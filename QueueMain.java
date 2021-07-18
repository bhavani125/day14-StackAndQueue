package com.ds;

public class QueueMain {
    public static void main(String[] args) {
        //Creating object for Queue class
        Queue myQueue =new Queue();
        myQueue.enQueue(56);
        myQueue.enQueue(30);
        myQueue.enQueue(70);
        myQueue.printQueue();
        System.out.println("Top  of the element is " + myQueue.peek());
        myQueue.printQueue();
   }

}
