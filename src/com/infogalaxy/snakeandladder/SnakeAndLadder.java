package com.infogalaxy.snakeandladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int playerPosition = 0;
	int option;
	int dieNo;
	int dieCount = 0;
	private static final int STAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	private static final int WINNING_NO = 100;
	
	public void show() {
		while (playerPosition != WINNING_NO) {
			System.out.println("Position of a player is: " +playerPosition);
			dieNo = random.nextInt(6) + 1;
			dieCount++;
			option = random.nextInt(3);
			
			switch(option) {
				case STAY:
					playerPosition = playerPosition;
					break;
				case LADDER:
					if(playerPosition + dieNo > WINNING_NO) {
						continue;
					}
					playerPosition = playerPosition + dieNo;
					break;
				case SNAKE:
					playerPosition = playerPosition - dieNo;
					if(playerPosition < 0) {
						playerPosition = 0;
					}
					break;
			}	
		}
		System.out.println("The value of a option is = " +option);
		System.out.println("The number on Die is = " +dieNo);
		System.out.println("The new position of a player = " +playerPosition);
		System.out.println("The total die required to win the game is = " +dieCount);
	}
	public static void main(String[] args) {
		SnakeAndLadder player1 = new SnakeAndLadder();
		player1.show();
	}
}
