package com.files;

public class Method {
    static Integer r, c;

    private static int check(int row, int coloumn, int value) {
        int i, j;
        int a = 3 * (int) (row / 3), b = 3 * (int) (coloumn / 3);
        for (j = 0; j < Matrix.N; j++) {
            if (j == coloumn || Matrix.grid[row][j] == 0) continue;
            if (Matrix.grid[row][j] == value) return 0;
        }
        for (i = 0; i < Matrix.N; i++) {
            if (i == row || Matrix.grid[i][coloumn] == 0) continue;
            if (Matrix.grid[i][coloumn] == value) return 0;
        }
        for (i = a; i < a + 3; i++)
            for (j = b; j < b + 3; j++) {
                if (Matrix.grid[i][j] == 0 || (i == row && j == coloumn)) continue;
                if (Matrix.grid[i][j] == value) return 0;
            }
        return 1;
    }

    public static int sudoku(int row, int coloumn, int value) {
        int variable;
        r = row;
        c = coloumn;
        if (value == Matrix.N + 1) return 0;
        if (row == Matrix.N) return 1;
        if (coloumn == Matrix.N) return sudoku(row + 1, 0, 1);
        if (Matrix.grid[row][coloumn] != 0) return sudoku(row, coloumn + 1, 1);

        Matrix.grid[row][coloumn] = value;
        if (check(row, coloumn, value) == 0) {
            Matrix.grid[row][coloumn] = 0;
            variable = sudoku(row, coloumn, value + 1);
        } else variable = sudoku(row, coloumn + 1, 1);

        if (variable == 0)
            if ((r != row) || (c != coloumn)) {
                Matrix.grid[row][coloumn] = 0;
                return sudoku(row, coloumn, value + 1);
            }
        return variable;
    }
}
