package com.bridgelabz.logicbuilding;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int factorial=1;
        System.out.println("Enter a number to find it's factorial: ");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();

        for (int i=1; i<=number; i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+ number +" is: "+ factorial);
    }
}
