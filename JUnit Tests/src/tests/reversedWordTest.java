package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import actions.Operator;

public class reversedWordTest {

	@Test
	public void test() {
		Operator action = new Operator();
		String value = action.reverseWord("flow");
		assertEquals("wolf",value);
	}

}
