package com.bridgelabz.dailyproblem;

import java.util.ArrayList;

//Use Array list to store number and apply operation on them
//Also used some methods to manipulate array list
public class BasicArrayList {
    public static void main(String args[]){
        ArrayList<Integer> intArr = new ArrayList<Integer>();

        intArr.add(25);
        intArr.add(2);
        intArr.add(19);
        intArr.add(11);
        intArr.add(45);

        System.out.println(intArr);

        intArr.remove(1);
        intArr.remove(3);

        System.out.println(intArr);

        if(intArr.contains(19)){
            System.out.println("Contains 19");
        }
        else{
            System.out.println("Contains no such element");
        }
        int elementAt1 = intArr.get(1);
        System.out.println("Element at index is: "+elementAt1);
    }
}

