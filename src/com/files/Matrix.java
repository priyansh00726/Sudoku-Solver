package com.files;

import java.util.*;

public class Matrix {
    public static Integer N = 9;
    public static Integer[][] grid = new Integer[N][N];

    static void input() {
        Scanner scan = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the Sudoku com.files.Matrix with zeroes in the blank spaces.\n");
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++) grid[i][j] = scan.nextInt();

    }

    static void display() {
        int i, j;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (grid[i][j] == 0) System.out.print("   ");
                else System.out.print("  " + grid[i][j]);
            }
            System.out.println();
        }

    }
}
