package com.opsdevelop.teaching.WeekThree;

public class COMP254CLL {
    private COMP254CLLNode head;
    private COMP254CLLNode tail;
    private int size;

    /**
     * Default constructor
     */
    public COMP254CLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Method to add a node to the beginning of the circular linked list
     * @param head
     */
    public void setHead(COMP254CLLNode head) {
        this.head = head;
    }

    /**
     * Method to add a node to the end of the circular linked list
     * @param tail
     */
    public void setTail(COMP254CLLNode tail) {
        this.tail = tail;
    }

    /**
     * Method to get the head of the circular linked list
     * @return head
     */
    public COMP254CLLNode getHead() {
        return this.head;
    }

    /**
     * Method to get the tail of the circular linked list
     * @return tail
     */
    public COMP254CLLNode getTail() {
        return this.tail;
    }

    /**
     * Method to insert a node at the beginning of the circular linked list
     * @param data
     */
    public void insertAtBeginning(String data) {
        COMP254CLLNode newNode = new COMP254CLLNode(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.tail.setNext(head);
        } else {
            newNode.setNext(head);
            this.head = newNode;
            this.tail.setNext(head);
        }
        this.size++;
    }

    /**
     * Method to insert a node at the end of the circular linked list
     * @param data
     */
    public void insertAtEnd(String data) {
        COMP254CLLNode newNode = new COMP254CLLNode(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.tail.setNext(head);
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
            this.tail.setNext(head);
        }
        this.size++;
    }

    /**
     * Method to insert a node at a given position in the circular linked list
     * @param data
     * @param position
     */
    public void insertAtPosition(String data, int position) {
        COMP254CLLNode newNode = new COMP254CLLNode(data);
        if (this.head == null || position <= 0) {
            insertAtBeginning(data);
        } else {
            COMP254CLLNode current = this.head;
            for (int i = 1; i < position - 1 && current != this.tail; i++) {
                current = current.getNext();
            }
            if (current != tail) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            } else {
                insertAtEnd(data);
            }
        }
        this.size++;
    }

    public void deleteAtBeginning() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            this.head = this.head.getNext();
            this.tail.setNext(this.head);
            this.size--;
        }
    }

    public void deleteAtEnd() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            COMP254CLLNode current = this.head;
            while (current.getNext() != this.tail) {
                current = current.getNext();
            }
            this.tail = current;
            this.tail.setNext(this.head);
            size--;
        }
    }

    public void deleteAtPosition(int position) {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            COMP254CLLNode current = this.head;
            for (int i = 1; i < position - 1 && current != this.tail; i++) {
                current = current.getNext();
            }
            if (current != this.tail) {
                current.setNext(current.getNext().getNext());
            } else {
                deleteAtEnd();
            }
            size--;
        }
    }

    /**
     * Method to display the circular linked list
     */
    public void display() {
        if (this.head == null) {
            System.out.println("List is empty");
        } else {
            COMP254CLLNode current = this.head;
            System.out.print(this.size + " ");
            do {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            } while (current != this.head);
            System.out.println();
        }
    }
}
