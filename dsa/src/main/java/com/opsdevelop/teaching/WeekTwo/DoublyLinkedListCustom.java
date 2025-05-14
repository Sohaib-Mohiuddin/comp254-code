package com.opsdevelop.teaching.WeekTwo;

public class DoublyLinkedListCustom {
    public class Node {
        private Object element;
        private Node prev;
        private Node next;

        public Node(Object e, Node p, Node n) {
            element = e;
            prev = p;
            next = n;
        }

        public Object getElement() {
            return element;
        }

        public Node getPrev() {
            return prev;
        }

        public Node getNext() {
            return next;
        }

        public void setPrev(Node p) {
            prev = p;
        }

        public void setNext(Node n) {
            next = n;
        }

        public String toString() {
            return element.toString();
        }
    }

    private Node header;
    private Node trailer;
    private int size = 0;
    private static final int MIN_CAPACITY = 10;

    public DoublyLinkedListCustom() {
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.setNext(trailer);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(Object e) {
        Node newNode = new Node(e, header, header.getNext());
        header.getNext().setPrev(newNode);
        header.setNext(newNode);
        size++;
    }

    public void addLast(Object e) {
        Node newNode = new Node(e, trailer.getPrev(), trailer);
        trailer.getPrev().setNext(newNode);
        trailer.setPrev(newNode);
        size++;
    }

    public void addAfter(Node node, Object e) {
        Node newNode = new Node(e, node, node.getNext());
        node.getNext().setPrev(newNode);
        node.setNext(newNode);
        size++;
    }

    public void remove(Node node) {
        Node prevNode = node.getPrev();
        Node nextNode = node.getNext();
        prevNode.setNext(nextNode);
        nextNode.setPrev(prevNode);
        size--;
    }

    public Object first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = header.getNext();
        while (current != trailer) {
            sb.append(current.getElement());
            if (current.getNext() != trailer) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
