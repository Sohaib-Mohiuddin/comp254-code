package com.opsdevelop.teaching.WeekOne;

public class Demonstration {
    public String someValue;
    public String name;

    public Demonstration(String someValue, String name) {
        this.someValue = someValue;
        this.name = name;
    }

    public void calculate() {
        if (someValue.length() > 5) {
            System.out.println(someValue);
        } else if (someValue.length() == 5) {
            System.out.println(someValue);
        } else {
            System.out.println("Did not work!");
        }
    }
}
