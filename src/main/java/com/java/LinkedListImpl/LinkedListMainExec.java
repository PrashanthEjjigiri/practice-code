package com.java.LinkedListImpl;

public class LinkedListMainExec {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);

        linkedList.printList();

        linkedList.delete(12);

        linkedList.printList();

        linkedList.delete(20);

        linkedList.printList();
    }
}
