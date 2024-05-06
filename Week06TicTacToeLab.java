package week06;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Week06TicTacToeLab {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String winner = "";
		String player = "X";
		GameBoard gameBoard = new GameBoard();
		gameBoard.initialize();
		gameBoard.display();
		int allSquares = 1;
		int squareNumber;
		while (winner.equals("") && allSquares <= 9) {
			System.out.println(player + "'s turn -- enter the number of the square you want to play a " + player + " on: ");
			String readInput = sc.nextLine();
			squareNumber = Integer.valueOf(readInput);
			
			if (squareNumber > 0 && squareNumber <= 9) {
				if (gameBoard.ifValidSetSquare(squareNumber, readInput, player)) {
					if (player.equals("X")) {
							player = "O";
				} else {
					player = "X";
				}
					allSquares++;
					gameBoard.display();
					winner = gameBoard.checkWinStatus();
			} else {
				System.out.println("Square has already been filled.");
			}
			
			}
		}
		System.out.println("----------------------");
		System.out.println("    Game Over");
		if (winner.equals("Draw")) {
			System.out.println("This game is a " + winner + "!");
		} else {
			System.out.println("     " + winner + " wins!");
		}
	}
	
	
	public static void playerSelection() {
		String player1;
		String player2;
		
		System.out.print("Player 1 type your name: ");
		player1 = sc.next();
		System.out.print("Player 2 type your name: ");
		player2 = sc.next();
		System.out.println(player1 + " is 'X' and " + player2 + " is 'O'");

	}
	

}
