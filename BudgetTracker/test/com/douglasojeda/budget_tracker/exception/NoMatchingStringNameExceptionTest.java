package com.douglasojeda.budget_tracker.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Testing the NoMatchingStringNameException class.
 * @author douglasojeda
 */
public class NoMatchingStringNameExceptionTest {
	/**
	 * Tests for the default constructor.
	 */
	@Test
	public void testDefaultConstructor() {
		NoMatchingStringNameException e = new NoMatchingStringNameException();
		assertEquals("There is no matching String name for this field.", e.getMessage());
	}
	/**
	 * Tests for custom message constructor.
	 */
	@Test
	public void testCustomConstructor() {
		NoMatchingStringNameException e = new NoMatchingStringNameException("Custom");
		assertEquals("Custom", e.getMessage());
	}

}
