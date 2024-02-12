package com.bridgelabz.logicbuilding;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (as an integer): ");
        int month = scanner.nextInt();

        System.out.print("Enter the day (as an integer): ");
        int day = scanner.nextInt();

        scanner.close();

        boolean isSpringSeason = checkDate(month, day);

        System.out.println(isSpringSeason);
    }

    public static boolean checkDate(int month, int day) {
        if (month < 3 || month > 6) {
            return false;
        }

        if (month == 3 && day < 20) {
            return false;
        }
        if (month == 6 && day > 20) {
            return false;
        }

        return true;
    }
}

