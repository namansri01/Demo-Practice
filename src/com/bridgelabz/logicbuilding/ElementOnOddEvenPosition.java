package com.bridgelabz.logicbuilding;

import java.sql.SQLOutput;

public class ElementOnOddEvenPosition {
    public static void main(String[] args){
        int arr[] = {5,66,98,3,24,7,1,21};
        int i,j;
        System.out.println("Elements at even position:");
        for(i=0;i< arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nElements at odd position:");
        for(j=1;j< arr.length;j+=2){
            System.out.print(arr[j]+" ");
        }
    }
}
