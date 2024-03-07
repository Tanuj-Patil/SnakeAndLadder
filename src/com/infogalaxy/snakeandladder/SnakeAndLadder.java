package com.infogalaxy.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		Random random = new Random();
		int pos = 0;
		int rollDie = random.nextInt(6) + 1;
		System.out.println("The position of a player is: " +pos);
		System.out.println("The position of a player is: " +rollDie);
	}

}
