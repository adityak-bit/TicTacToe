package com.cg.examples;

import java.util.Scanner;

public class TicTacToeGame {

	private static char board[][] = new char[3][3];
	private static Scanner in;
	public static final int HEAD = 1;
	public static final int TAIL = 1;

	public static enum Player {
		USER, COMPUTER;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		int counter = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = Character.forDigit(counter++, 11);
			}
		}

		in = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';
		char indexChoice;
		Player player = getWhoStartsFirst();

		for (int i = 0; i < 3; i++) {
			System.out.println(player + " starts first");
			System.out.println("Enter index choice from 1-9: ");
			indexChoice = in.next().charAt(0);
			replaceIndex(board, indexChoice, player == Player.USER ? userLetter : computerLetter);
			displayBoard(board);
		}
		System.out.println(player+" wins: "+isWinner(board,player == Player.USER ? userLetter : computerLetter));
	}

	private static char chooseUserLetter(Scanner userInput) {
		System.out.println("Choose your letter X or O: ");
		return userInput.next().toUpperCase().charAt(0);
	}

	private static Player getWhoStartsFirst() {
		int toss = (int) (Math.random() * 10) % 2;
		return (toss == HEAD) ? Player.USER : Player.COMPUTER;
	}

	private static void replaceIndex(char board[][], char find, char replace) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == find && board[i][j] != 'X' && board[i][j] != 'O') {
					board[i][j] = replace;
					return;
				}
			}
		}
	}

	private static boolean isWinner(char[][] b, char ch) {
		return (b[0][0] == ch && b[0][1] == ch && b[0][2] == ch || b[1][0] == ch && b[1][1] == ch && b[1][2] == ch
				|| b[2][0] == ch && b[2][1] == ch && b[2][2] == ch || b[0][0] == ch && b[1][0] == ch && b[2][0] == ch
				|| b[0][1] == ch && b[1][1] == ch && b[2][1] == ch || b[0][2] == ch && b[1][2] == ch && b[2][2] == ch
				|| b[0][0] == ch && b[1][1] == ch && b[2][2] == ch || b[0][2] == ch && b[1][1] == ch && b[2][0] == ch);
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
