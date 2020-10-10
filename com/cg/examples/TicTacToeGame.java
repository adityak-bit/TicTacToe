package com.cg.examples;

import java.util.Scanner;

public class TicTacToeGame {

	private static char board[][] = new char[3][3];

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		Scanner userInput = new Scanner(System.in);
		char userLetter = chooseUserLetter(userInput);
		char computerLetter = (userLetter == 'X') ? 'O' : 'X';
	}

	private static char chooseUserLetter(Scanner userInput) {
		System.out.println("Choose your letter X or O: ");
		return userInput.next().toUpperCase().charAt(0);
	}
}
