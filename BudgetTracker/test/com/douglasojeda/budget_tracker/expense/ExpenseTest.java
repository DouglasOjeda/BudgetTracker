package com.douglasojeda.budget_tracker.expense;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Testing class for Expense
 */
public class ExpenseTest {
	/**
	 * Tests for the construction.
	 */
	@Test
	public void test() {
		Expense e1 = new Expense(null, null, null, 0, 0, 0, 0, false);
	}

}
