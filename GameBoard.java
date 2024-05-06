package week06;

import java.util.Arrays;

public class GameBoard {
	
	String[] board = new String[9];
	
	public void initialize() {			
		for (int i = 1; i <= 9; i++) {
			this.board[i-1] = String.valueOf(i);
		}
	}

	public void display() {
		System.out.println();
		System.out.println("+---+---+---+");
		System.out.println("| " + board[0] + " | " + board[1] + " | " +  board[2] + " |" );
		System.out.println("+---+---+---+");
		System.out.println("| " + board[3] + " | " + board[4] + " | " +  board[5] + " |" );
		System.out.println("+---+---+---+");
		System.out.println("| " + board[6] + " | " + board[7] + " | " +  board[8] + " |" );
		System.out.println("+---+---+---+");
	}

	public boolean ifValidSetSquare(int squareNumber, String readInput, String player) {
		if (board[squareNumber - 1].equals(readInput)) {
			board[squareNumber - 1] = player;
			return true;
		} else {
			
		}
		return false;
	}

	public String checkWinStatus() {
		for (int pos = 0; pos < 8; pos++) {
			String winningCombo = "";
			switch (pos) {
			case 0:
				winningCombo = board[0] + board[1] + board[2];
				break;
			case 1:
				winningCombo = board[3] + board[4] + board[5];
				break;
			case 2:
				winningCombo = board[6] + board[7] + board[8];
				break;
			case 3:
				winningCombo = board[0] + board[4] + board[8];
				break;
			case 4:
				winningCombo = board[2] + board[4] + board[6];
				break;
			case 5:
				winningCombo = board[0] + board[3] + board[6];
				break;
			case 6:
				winningCombo = board[1] + board[4] + board[7];
				break;
			case 7:
				winningCombo = board[2] + board[5] + board[8];
				break;
			}
			
			if (winningCombo.equals("XXX")) {
				return "X";
			} else if (winningCombo.equals("OOO")) {
				return "O";
			}
			
		}
		for (int pos = 1; pos <= 9; pos++) {
			if (Arrays.asList(this.board).contains(String.valueOf(pos))) {
				break;
			} else if (pos == 9) {
				return "Draw";
			}
		}
		return "";
	}
	
}