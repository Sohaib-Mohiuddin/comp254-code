package com.opsdevelop.teaching.WeekOne;

public class Demonstration {
    public String someValue;

    public Demonstration(String someValue) {
        this.someValue = someValue;
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
