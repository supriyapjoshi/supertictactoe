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

	public boolean play(int row, int col, String value) {
		// TODO Auto-generated method stub
		
		boolean valid = false;
		if (isInputValueValid(value) && simpleBoard[row][col] == null || "".equals(simpleBoard[row][col])) {
			simpleBoard[row][col] = value;
			numberOfEmptySlots--;
			valid = true;
		}
		return valid;
	}

	private boolean isInputValueValid(String value) {
		// TODO Auto-generated method stub
		boolean valid = false;
		if("X".equals(value) || "0".equals(value)) {
			valid = true;
		}
		return valid;
	}

	public int emptySlots() {
		// TODO Auto-generated method stub
		return numberOfEmptySlots;
	}
	
}
