package com.bridgelabz.logicbuilding;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        scanner.close();

        boolean isLeapYear = isLeapYear(year);

        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public static boolean isLeapYear(int year) {
        // Check if the year is greater than or equal to 1582 (Gregorian calendar adoption year)
        if (year < 1582) {
            System.out.println("Leap Year calculation is only valid for years <= 1582 (Gregorian calendar adoption year).");
            return false;
        }

        // Check if the year is divisible by 4 and not divisible by 100 unless it's also divisible by 400
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
