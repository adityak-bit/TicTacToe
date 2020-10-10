package com.cg.examples;

import java.util.Scanner;

public class TicTacToeGame {

	public static final int HEAD = 1;
	public static final int TAIL = 1;

	public static enum Player {
		USER, COMPUTER;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		Player player = getWhoStartsFirst();
	}

	private static Player getWhoStartsFirst() {
		int toss = (int) (Math.random() * 10) % 2;
		return (toss == HEAD) ? Player.USER : Player.COMPUTER;
	}
}
