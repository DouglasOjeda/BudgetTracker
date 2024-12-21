package com.douglasojeda.budget_tracker.expense;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.douglasojeda.budget_tracker.expense.Expense.ExpenseType;
/**
 * Testing class for Expense
 */
public class ExpenseTest {
	/**
	 * Tests for the construction.
	 */
	@Test
	public void test() {
		Expense e1 = new Expense(ExpenseType.HEALTH, "Vitamins", "I bought vitamins.",
				19.99, 1, 0, 0, false);
		assertEquals(Expense.HEALTH_NAME, e1.getExpenseType());
		assertEquals("Vitamins", e1.getName());
		assertEquals("I bought vitamins.", e1.getDescription());
		assertEquals(19.99, e1.getAmount());
		assertEquals(19.99, e1.getAmount());
		assertEquals(19.99, e1.getAmount());
		assertEquals(19.99, e1.getAmount());
		
	}

}
