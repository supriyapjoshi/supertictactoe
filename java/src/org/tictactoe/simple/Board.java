package org.tictactoe.simple;

public class Board {
	private String[][] simpleBoard = new String[3][3];
	private int numberOfEmptySlots = 9;

	public int rows() {
		return simpleBoard.length;
	}

	public int columns() {
		return simpleBoard[0].length;
	}

	public boolean play(int row, int col, String value) {
		boolean valid = false;
		if (isInputValueValid(value) && numberOfEmptySlots >0 && 
				isValidRowAndCol(row, col)) {
			simpleBoard[row][col] = value;
			numberOfEmptySlots--;
			valid = true;
		}
		return valid;
	}

	private boolean isValidRowAndCol(int row, int col) {
		boolean valid = false;
		if(simpleBoard[row][col] == null || "".equals(simpleBoard[row][col])) {
			valid = true;
		}
		return valid;
	}

	private boolean isInputValueValid(String value) {
		boolean valid = false;
		if("X".equals(value) || "0".equals(value)) {
			valid = true;
		}
		return valid;
	}

	public int emptySlots() {
		return numberOfEmptySlots;
	}
}
