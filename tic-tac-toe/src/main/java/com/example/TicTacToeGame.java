package com.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import com.example.model.Board;
import com.example.model.PieceO;
import com.example.model.PieceType;
import com.example.model.PieceX;
import com.example.model.Player;

public class TicTacToeGame {

    public Deque<Player> players;
    public Board board;

    void initializeGame() {

        players = new LinkedList<>();

        PieceX cross = new PieceX();
        PieceO round = new PieceO();

        Player player1 = new Player("Player1", cross);
        Player player2 = new Player("Player2", round);

        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while(noWinner) {

            Player playerTurn = players.removeFirst();
            board.printBoard();
            if(board.count == 0) {
                noWinner = false;
                continue;
            }
            
            System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAdded = board.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());

            if(!pieceAdded) {
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            boolean winner = this.isWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().type);

            if(winner) return playerTurn.getName();
        }
        return "tie";
    }

    public boolean isWinner(int row, int col, PieceType pieceType) {
        boolean rowCheck = true;
        boolean colCheck = true;
        boolean diagCheck = true;
        boolean adiagCheck = true;

        for(int i=0; i<board.size; i++) {
            if(board.board[row][i]==null || (board.board[row][i]!=null && board.board[row][i].type != pieceType)) rowCheck = false;
            if(board.board[i][col]==null || (board.board[i][col]!=null && board.board[i][col].type != pieceType)) colCheck = false;

            if((board.board[i][i]==null || (board.board[i][i]!=null && board.board[i][i].type != pieceType))) diagCheck = false;
            if((board.board[i][board.size-1-i]==null || (board.board[i][board.size-1-i]!=null && board.board[i][board.size-1-i].type != pieceType))) adiagCheck = false;
        }
        return (rowCheck | colCheck | diagCheck | adiagCheck);
    }
}
