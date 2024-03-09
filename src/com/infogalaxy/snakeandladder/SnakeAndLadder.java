package com.infogalaxy.snakeandladder;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int playerPosition = 0;
	int option;
	int dieNo;
	private static final int STAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;
	
	public void show() {
		while (playerPosition != 100) {
			System.out.println("Position of a player is: " +playerPosition);
			dieNo = random.nextInt(6) + 1;
			option = random.nextInt(3);
			
			switch(option) {
				case STAY:
					playerPosition = playerPosition;
					break;
				case LADDER:
					if(playerPosition + dieNo > 100) {
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
	}
	public static void main(String[] args) {
		SnakeAndLadder player1 = new SnakeAndLadder();
		player1.show();
	}
}
