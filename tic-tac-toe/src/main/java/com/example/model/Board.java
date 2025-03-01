package com.example.model;

public class Board {

    public int size, count;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
        this.count = (size*size);
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col] != null) return false;
            board[row][col] = playingPiece;
            this.count--;
        return true;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                   System.out.print(board[i][j].type.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }
}
