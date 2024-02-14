package com.bridgelabz.logicbuilding;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args)
    {
        //int arr[];
        int i,n,num,j,temp;
        //int[] element= {};
        int frequency;

        System.out.println("Enter number of elements in array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array:");

        for( i=0 ; i<n ; i++ ) {
        num= sc.nextInt();
        arr[i]=num;
        }
        for ( i = 0; i < arr.length; i++) {
            for ( j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Element\tFrequency");

        for (i = 0; i < n; i++) {
            frequency = 1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                    arr[j] = Integer.MAX_VALUE; // Mark visited
                }
            }
            if (arr[i] != Integer.MAX_VALUE) { // Avoid printing visited elements
                System.out.println(arr[i] +"\t\t\t"+ frequency);
            }
        }

//        for ( i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
