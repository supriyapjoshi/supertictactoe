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
}
