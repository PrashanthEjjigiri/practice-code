package com.java.LinkedListImpl;

public class LinkedList {
    Node head;
    public LinkedList(){
        head=null;
    }

    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=new Node(data);
        }else{
            Node current=head;
        while(current.next != null){
            current=current.next;
        }
        current.next=newNode;
    }}

    public void printList(){
        Node current= head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;

        }
        System.out.println("null");

    }

    public void delete(int value){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        if(head.data==value){
            head=head.next;
            return;
        }

        Node current=head;
        Node previous=null;

        while(current != null && current.data != value){
            previous=current;
            current=current.next;
        }
        if (current==null){
            System.out.println("Value"+value+"Not found");
return;
        }
        previous.next=current.next;

    }
}
