package com.cg.examples;

public class TicTacToeGame {

	private static char board[][] = new char[3][3];

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		int counter = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = Character.forDigit(counter++, 11);
			}
		}
		displayBoard(board);
	}

	private static void displayBoard(char board[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
