package com.tictactoe;
import java.util.Scanner;
public class TicTacToe {
    static Scanner sc = new Scanner(System.in);
    static char[]board;

    public static void main(String []args) {
        System.out.println("Welcome To Tic-Tac-Toe Game");
        initializeBoard();
        input();
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
            compute="o";
        }
        else if(input =='O') {
            compute="x";
        }
        else {
            System.out.println("Enter correct choice");
            input();
        }
    }
}
