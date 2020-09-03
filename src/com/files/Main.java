package com.files;

public class Main {
    public static void main(String[] args) {
        Matrix.input();
        System.out.println("\n\nThe Entered Unsolved Sudoku :");
        Matrix.display();

        if (Method.sudoku(0, 0, 1) != 1) System.out.println("\nEntered Sudoku is unsolvable.");
        else {
            System.out.println("\n\nThe solved Sudoku com.files.Matrix is :");
            Matrix.display();
        }
    }

}
