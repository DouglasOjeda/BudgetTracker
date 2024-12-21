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
	public void testConstructor() {
		Expense e1 = new Expense(ExpenseType.HEALTH, "Vitamins", "I bought vitamins.",
				1999, 12, 5, 2024, false);
		assertEquals(Expense.HEALTH_NAME, e1.getStringExpenseType());
		assertEquals("Vitamins", e1.getName());
		assertEquals("I bought vitamins.", e1.getDescription());
		assertEquals(1999, e1.getAmount());
		assertEquals(19.99, e1.getDollarAmount());
		assertEquals(12, e1.getDayOfExpense());
		assertEquals(5, e1.getMonthOfExpense());
		assertEquals(2024, e1.getYearOfExpense());
	}

}
