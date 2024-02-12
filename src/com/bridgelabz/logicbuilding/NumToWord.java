package com.bridgelabz.logicbuilding;

import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args){
        System.out.println("Enter a single digit number:");
        Scanner s= new Scanner(System.in);
        int number=s.nextInt();
        if(number<0 || number>9) {
            System.out.println("Invalid input-- Enter single digit number.");
            return;
        }
        String word = "";
        switch (number) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
        }

        System.out.println("The number " + number + " in words is: " + word);
    }
}
