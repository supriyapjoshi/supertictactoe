package org.tictactoe.simple;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BoardTest {
	@Test
	public void constructABoardWith3x3Inputs() {
		Board board = new Board();
		Assert.assertEquals(board.rows(),3);
		Assert.assertEquals(board.columns(),3);
	}
	
	@Test
	public void occupySlot() {
		Board board = new Board();
		board.play(0, 0, "X");
		Assert.assertEquals(8,board.emptySlots());
	}
	
	@Test
	public void checkIfPlayedSlotIsValid() {
		Board board = new Board();
		Assert.assertTrue(board.play(0, 0, "X"));
		Assert.assertEquals(8,board.emptySlots());
		Assert.assertFalse(board.play(0, 0, "0"));
		Assert.assertEquals(8,board.emptySlots());
		
	}
	
	@Test
	public void validateInput() {
		Board board = new Board();
		Assert.assertFalse(board.play(0, 0, "M"));
		Assert.assertTrue(board.play(0,0,"X"));
		Assert.assertTrue(board.play(0,1,"0"));
		Assert.assertFalse(board.play(0,0,"X"));
		Assert.assertFalse(board.play(0,0, null));
	}
	
	@Test
	public void validateThatThereAreNoEmptySlots() {
		Board board = new Board();
		Assert.assertTrue(board.play(0,0,"X"));
		Assert.assertTrue(board.play(0,1,"X"));
		Assert.assertTrue(board.play(0,2,"X"));
		Assert.assertTrue(board.play(1,0,"X"));
		Assert.assertTrue(board.play(1,1,"X"));
		Assert.assertTrue(board.play(1,2,"X"));
		Assert.assertTrue(board.play(2,0,"X"));
		Assert.assertTrue(board.play(2,1,"X"));
		Assert.assertTrue(board.play(2,2,"X"));
		Assert.assertFalse(board.play(0,0,"X"));
	}
	@Test
	public void checkForWin() {
		Board board = new Board();
		board.play(0, 0, "X");
		board.play(0, 1, "X");
		board.play(0, 2, "X");
		//Assert.assertEquals("X", board.whoIsTheWinner());
	}
}
