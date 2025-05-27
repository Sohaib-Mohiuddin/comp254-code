package com.opsdevelop.teaching.WeekThree;

public class CloneLinkedList {
    public static void cloneLinkedList(LinkedList list) {
        LinkedList clone = new LinkedList();
        Node current = list.getHead();
        while (current != null) {
            clone.insertAtEnd(current.getData());
            current = current.getNext();
        }
        System.out.println("Clone of the linked list: ");
        System.out.println("list == clone: " + (list == clone));
        System.out.println("list.equals(clone): " + list.equals(clone));
        System.out.println("list.getHead() == clone.getHead(): " + (list.getHead() == clone.getHead()));
        System.out.println("list.getTail() == clone.getTail(): " + (list.getTail() == clone.getTail()));
    }

    public static void cloneCLL(CLL list) {
        CLL clone = new CLL();
        CLLNode current = list.getHead();
        while (current != null) {
            clone.insertAtEnd(current.getData());
            current = current.getNext();
        }

        // Set the tail of the clone to point to the head
        // clone.setTail(clone.getHead());

        System.out.println("Clone of the circular linked list: ");
        System.out.println("list == clone: " + (list == clone));
        System.out.println("list.equals(clone): " + list.equals(clone));
        System.out.println("list.getHead() == clone.getHead(): " + (list.getHead() == clone.getHead()));
        System.out.println("list.getTail() == clone.getTail(): " + (list.getTail() == clone.getTail()));
    }

    public static void main(String[] args) {
        // Create a linked list and clone it
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        cloneLinkedList(linkedList);

        // Create a circular linked list and clone it
        CLL circularLinkedList = new CLL();
        circularLinkedList.insertAtEnd(1);
        circularLinkedList.insertAtEnd(2);
        circularLinkedList.insertAtEnd(3);
        // cloneCLL(circularLinkedList);
    }
}
