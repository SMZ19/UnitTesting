package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import actions.Operator;

class parameterizedTest {

	@ParameterizedTest
	@ValueSource(strings = {"luz azul","sé verlas al revés","Amo la paloma"})
	void isPalindrome(String value) {
		Operator action = new Operator();
		assertTrue(action.isPalindrome(value));
	}

}
