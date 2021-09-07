package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import actions.Operator;

public class sumTest {

	@Test
	public void test() {
		Operator action = new Operator();
		int value = action.sum(7,7);
		assertEquals(14,value);
	}

}
