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
	
	
}
