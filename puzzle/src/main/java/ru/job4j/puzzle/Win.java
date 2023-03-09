package ru.job4j.puzzle;

public class Win {
    public static boolean horizontal(int[][] board, int row) {
        boolean rsl = true;
            for (int j = 0; j < board.length; j++) {
                if (board[row][j] != 1) {
                    rsl = false;
                }
                break;
            }
        return rsl;
    }

    public static boolean vertical(int[][] board, int cell) {
        boolean rsl = true;
            for (int j = 0; j < board.length; j++) {
                if (board[j][cell] != 1) {
                    rsl = false;
                }
                break;
            }
        return rsl;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        int index = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                index = i;
            }
        }
        if (vertical(board, index) || horizontal(board, index)) {
            rsl = true;
        }
        return rsl;
    }
}
