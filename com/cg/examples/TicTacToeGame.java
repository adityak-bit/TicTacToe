package com.cg.examples;

import java.util.Scanner;

public class TicTacToeGame {

	private static char board[][] = new char[3][3];
	private static Scanner in;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		int counter = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = Character.forDigit(counter++, 11);
			}
		}
		in = new Scanner(System.in);
		System.out.println("Enter your index choice from 1-9: ");
		char indexChoice = in.next().charAt(0);
		System.out.println("Enter userInput X or O: ");
		char userInput = in.next().charAt(0);
		replaceIndex(board, indexChoice, userInput);
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

	private static void replaceIndex(char board[][], char find, char replace) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == find) {
					board[i][j] = replace;
					return;
				}
			}
		}
	}
}
