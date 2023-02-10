package com.tictactoe;
import java.util.Scanner;
public class TacTacToeBoard {
    static Scanner sc = new Scanner(System.in);
    static char[]board;

    public static void main(String []args) {

        System.out.println("Welcome To Tic-Tac-Toe Game");
        initializeBoard();
        input();
        showBoard();
    }

    static void initializeBoard() {
        board = new char[10];
        for(int i = 1; i< 10; i++){
            board[i]='-';
        }
    }

    static void input() {

        System.out.println("Enter option X or O");
        char input = sc.next().toUpperCase().charAt(0);
        String compute;
        if(input == 'X') {
            compute="O";
        }
        else if(input =='O') {
            compute="X";
        }
        else {
            System.out.println("Enter correct choice");
            input();
        }
    }

    static void showBoard() {
        System.out.println("/-----------\\");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " | ");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " | ");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " | ");
        System.out.println("/-----------\\");
    }




}
