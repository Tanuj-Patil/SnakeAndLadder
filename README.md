## Snake & Ladder Simulator

This project implements a Snake and Ladder Game simulation in Java. Players start from position 0 and roll a die to move across the board. The objective is to reach the winning spot, typically at position 100. Along the way, players encounter safe spots, ladders that help them advance, and snakes that set them back.

### Use Cases

1. **UC-1: Single Player Setup**
   - The game starts with a single player positioned at 0.

2. **UC-2: Rolling the Die**
   - The player rolls the die to get a number between 1 to 6 using ((RANDOM)).

3. **UC-3: Checking for Options**
   - After rolling the die, the player checks for three options: No Play, Ladder, or Snake, using ((RANDOM)).
   - If it's a No Play, the player stays in the same position.
   - If it's a Ladder, the player moves ahead by the number of positions received on the die.
   - If it's a Snake, the player moves behind by the number of positions received on the die.

4. **UC-4: Reaching the Winning Position**
   - The game continues until the player reaches the winning position 100.
   - If the player's position goes below 0, the player restarts from position 0.

5. **UC-5: Ensuring Exact Winning Position**
   - If the player's position goes above 100, the player stays in the previous position until they get the exact number needed to reach 100.

6. **UC-6: Reporting Dice Rolls and Positions**
   - After each die roll, report the number of times the dice was played to win the game and the position after every roll.

7. **UC-7: Multiplayer Setup**
   - Play the game with 2 players.
   - If a player gets a ladder, they play again.
   - Finally, report which player won the game based on UC 7.

### Project Description

The Snake & Ladder Simulator is designed to replicate the traditional game experience. Players take turns rolling a die and moving across the board based on the outcome. Ladders allow players to ascend to higher positions, while snakes bring them down. The game continues until one player reaches the winning position 100.

### How to Run

To run the Snake & Ladder Simulator:

1. Clone the repository.
2. Compile and run the main program.
3. Follow the prompts to play the game and navigate through the board.

### Project Structure

The project contains a Java class named `SnakeAndLadder` that implements the game logic. It uses random number generation to simulate die rolls and options (No Play, Ladder, Snake). The game continues until a player reaches the winning position.

### Author

This project is developed by Tanuj Patil.

### License

This project is licensed under the [MIT License](LICENSE).

--- 

Feel free to adjust the author section and include your name or any additional information you deem necessary.
