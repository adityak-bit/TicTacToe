package com.cg.examples;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		
	}

	private static boolean isWinner(char[][] b,char ch) {
		return( b[0][0] == ch && b[0][1] == ch && b[0][2] == ch ||
				b[1][0] == ch && b[1][1] == ch && b[1][2] == ch ||
				b[2][0] == ch && b[2][1] == ch && b[2][2] == ch ||
				b[0][0] == ch && b[1][0] == ch && b[2][0] == ch ||
				b[0][1] == ch && b[1][1] == ch && b[2][1] == ch ||
				b[0][2] == ch && b[1][2] == ch && b[2][2] == ch ||
				b[0][0] == ch && b[1][1] == ch && b[2][2] == ch ||
				b[0][2] == ch && b[1][1] == ch && b[2][0] == ch );
	}
	
}
