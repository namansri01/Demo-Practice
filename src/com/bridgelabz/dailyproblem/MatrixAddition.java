package com.bridgelabz.dailyproblem;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int matrixOne[][] = new int[3][3];
        int matrixtwo [][]= new int[3][3];
        int add[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First matrix: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixOne[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter second matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixtwo[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                add[i][j] = matrixOne[i][j] + matrixtwo[i][j];
            }
        }

        System.out.println("Addition of the given matrix is: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(add[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
