package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class windowsOnlyTest {

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void test() {
		System.out.println("Hello Windows User!");
	}
	@Test
	@DisabledOnOs(OS.LINUX)
	void test2() {
		System.out.println("Hello No Linux User!");
	}
}
