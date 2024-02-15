package com.bridgelabz.logicbuilding;

public class Construct {
    private int value;

    public Construct() {
        this.value = 0; // Default value
    }

    public Construct(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Construct obj1 = new Construct();
        Construct obj2 = new Construct(10);

        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
    }
}
