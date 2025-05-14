package com.opsdevelop.teaching.Labs.Lab1Exercises.UsingGenerics;

//a generic version of the Box class
//
public class GenericBox<T> {
    // T stands for "Type"
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
