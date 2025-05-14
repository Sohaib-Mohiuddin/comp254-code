package com.opsdevelop.teaching.WeekTwo;

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedListCustom customList = new DoublyLinkedListCustom();
        customList.addFirst(1);
        customList.addLast(3);

        System.out.println(customList.toString());
    }
}
