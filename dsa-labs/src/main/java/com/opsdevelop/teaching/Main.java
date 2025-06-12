package com.opsdevelop.teaching;

// Lab 5 Imports
import com.opsdevelop.teaching.Lab5Exercises.Lesson5Files.LinearSum;

// Lab 6 Imports
import com.opsdevelop.teaching.Lab6Exercises.stacks.ArrayStack;
import com.opsdevelop.teaching.Lab6Exercises.stacks.LinkedStack;

public class Main {
    public static void week5Runnable() {
        int[] a = {1, 2, 3, 9, 4, 5, 8, 6, 7, 10};
        int n = a.length;

        LinearSum.maxElement(a, n);
    }

    public static void lab6Ex2Runnable() {
        ArrayStack<String> stack = new ArrayStack<>(10); // Create an ArrayStack with capacity 10

        // List of names to push onto the stack
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve", "Sohaib"};

        // Push the names onto the stack
        for (String name : names) {
            stack.push(name);
            System.out.println("Pushed: " + name);
        }

        // Pop the names off the stack
        System.out.println("\nPopping names off the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Confirm the stack is empty
        System.out.println("Stack is now empty: " + stack.isEmpty());
    }
    public static void lab6Ex3Runnable() {
        LinkedStack<String> stack = new LinkedStack<>();

        String[] names = {"First", "Second", "Third", "Fourth", "Fifth"};

        for (String name : names) {
            stack.push(name);
            System.out.println("Pushed: " + name);
        }

        // Print the stack
        System.out.println("Stack contents: " + stack);

        // Empty the stack using pop()
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Confirm the stack is empty
        System.out.println("Stack is now empty: " + stack.isEmpty());
    }
    public static void main(String[] args) {
         // week5Runnable();
        lab6Ex2Runnable();
        lab6Ex3Runnable();
    }
}