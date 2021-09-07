package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import actions.Operator;

public class findMaxTest {

	@Test
	public void test() {
		Operator action = new Operator();
		int value = action.findMax(new int[]{1,5,3,9,0});
		int value2 = action.findMax(new int[]{-7,-4,-9,-8,-2});
		assertEquals(9,value);
		assertEquals(-2,value2);
	}

}
