package com.bridgelabz.dailyproblem;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        int ref =num;
        int factorial;
        int sum=0;int n;

        while(num>0){
            factorial=1;
            n=num%10;
        for(int i=1 ; i<=n ; i++){
            factorial *= i;
        }
        sum=sum + factorial;
        num=num/10;
        }
        if(sum==ref){
            System.out.println("Entered number is Peterson");
        }
        else{
            System.out.println("Entered number is not Peterson number");
        }
    }
}
