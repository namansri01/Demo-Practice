package com.bridgelabz.logicbuilding;

public class StaticVariable {
    static int staticVariable;

    static {
        System.out.println("Inside static block.");
        staticVariable = 10;
    }

    public static void main(String[] args) {
        System.out.println("Inside main method.");
        System.out.println("Value of staticVariable: " + staticVariable);
    }
}
