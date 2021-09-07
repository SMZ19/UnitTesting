package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import actions.Operator;

public class squareTest {

	@Test
	public void test() {
		Operator action = new Operator();
		int value = action.square(6);
		assertEquals(36,value);
	}

}
