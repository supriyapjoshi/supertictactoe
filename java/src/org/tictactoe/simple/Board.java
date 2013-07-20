package org.tictactoe.simple;

public class Board {
	private String[][] simpleBoard = new String[3][3];
	private int numberOfEmptySlots = 9;

	public int rows() {
		// TODO Auto-generated method stub
		return simpleBoard.length;
	}

	public Object columns() {
		// TODO Auto-generated method stub
		return simpleBoard[0].length;
	}

	public void play(int row, int col, String value) {
		// TODO Auto-generated method stub
		simpleBoard[row][col] = value;
		numberOfEmptySlots--;
	}

	public int emptySlots() {
		// TODO Auto-generated method stub
		return numberOfEmptySlots;
	}
	
}
