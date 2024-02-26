package com.bridgelabz.logicbuilding;

class Addtion{
    public int add(int n1, int n2){
        int r=n1+n2;
        return r;
    }

}

public class Calculator {
    public static void main(String args[]){
        int num1=4,num2=5;

        Addtion calc = new Addtion();
        int result= calc.add(num1,num2);
        System.out.println(result);
    }
}

