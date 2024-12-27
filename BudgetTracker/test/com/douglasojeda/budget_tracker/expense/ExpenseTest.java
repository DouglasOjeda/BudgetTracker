package com.douglasojeda.budget_tracker.expense;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.douglasojeda.budget_tracker.expense.Expense.ExpenseType;
/**
 * Testing class for Expense
 */
public class ExpenseTest {
	//Constants fields for testing
	private final String NAME = "Name";
	private final String DESCRIPTION = "Desc.";
	private final int AMOUNT = 1999;
	private final double DOLLAR_AMOUNT = 19.99;
	private final int DAY = 5;
	private final int MONTH = 11;
	private final int YEAR = 2024;
	private final boolean RECURRING = true;
	
	
	/**
	 * Tests for the main Object construction.
	 */
	@Test
	public void testMainConstructor() {
		//main constructor
		Expense e1 = new Expense(ExpenseType.HOUSING, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.HOUSING_NAME, e1.getStringExpenseType());
		assertEquals(NAME, e1.getName());
		assertEquals(DESCRIPTION, e1.getDescription());
		assertEquals(AMOUNT, e1.getAmount());
		assertEquals(DOLLAR_AMOUNT, e1.getDollarAmount());
		assertEquals(DAY, e1.getDayOfExpense());
		assertEquals(MONTH, e1.getMonthOfExpense());
		assertEquals(YEAR, e1.getYearOfExpense());
		
		Expense e2 = new Expense(ExpenseType.TRANSPORTATION, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.TRANSPORTATION_NAME, e2.getStringExpenseType());
		assertEquals(NAME, e2.getName());
		assertEquals(DESCRIPTION, e2.getDescription());
		assertEquals(AMOUNT, e2.getAmount());
		assertEquals(DOLLAR_AMOUNT, e2.getDollarAmount());
		assertEquals(DAY, e2.getDayOfExpense());
		assertEquals(MONTH, e2.getMonthOfExpense());
		assertEquals(YEAR, e2.getYearOfExpense());
		
		Expense e3 = new Expense(ExpenseType.INSURANCE, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.INSURANCE_NAME, e3.getStringExpenseType());
		assertEquals(NAME, e3.getName());
		assertEquals(DESCRIPTION, e3.getDescription());
		assertEquals(AMOUNT, e3.getAmount());
		assertEquals(DOLLAR_AMOUNT, e3.getDollarAmount());
		assertEquals(DAY, e3.getDayOfExpense());
		assertEquals(MONTH, e3.getMonthOfExpense());
		assertEquals(YEAR, e3.getYearOfExpense());
		
		Expense e4 = new Expense(ExpenseType.UTILITIES, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.UTILITIES_NAME, e4.getStringExpenseType());
		assertEquals(NAME, e4.getName());
		assertEquals(DESCRIPTION, e4.getDescription());
		assertEquals(AMOUNT, e4.getAmount());
		assertEquals(DOLLAR_AMOUNT, e4.getDollarAmount());
		assertEquals(DAY, e4.getDayOfExpense());
		assertEquals(MONTH, e4.getMonthOfExpense());
		assertEquals(YEAR, e4.getYearOfExpense());
		
		Expense e5 = new Expense(ExpenseType.INVESTMENTS, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.INVESTMENTS_NAME, e5.getStringExpenseType());
		assertEquals(NAME, e5.getName());
		assertEquals(DESCRIPTION, e5.getDescription());
		assertEquals(AMOUNT, e5.getAmount());
		assertEquals(DOLLAR_AMOUNT, e5.getDollarAmount());
		assertEquals(DAY, e5.getDayOfExpense());
		assertEquals(MONTH, e5.getMonthOfExpense());
		assertEquals(YEAR, e5.getYearOfExpense());
		
		Expense e6 = new Expense(ExpenseType.SAVINGS, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.SAVINGS_NAME, e6.getStringExpenseType());
		assertEquals(NAME, e6.getName());
		assertEquals(DESCRIPTION, e6.getDescription());
		assertEquals(AMOUNT, e6.getAmount());
		assertEquals(DOLLAR_AMOUNT, e6.getDollarAmount());
		assertEquals(DAY, e6.getDayOfExpense());
		assertEquals(MONTH, e6.getMonthOfExpense());
		assertEquals(YEAR, e6.getYearOfExpense());
		
		Expense e7 = new Expense(ExpenseType.PROFESSIONAL, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.PROFESSIONAL_NAME, e7.getStringExpenseType());
		assertEquals(NAME, e7.getName());
		assertEquals(DESCRIPTION, e7.getDescription());
		assertEquals(AMOUNT, e7.getAmount());
		assertEquals(DOLLAR_AMOUNT, e7.getDollarAmount());
		assertEquals(DAY, e7.getDayOfExpense());
		assertEquals(MONTH, e7.getMonthOfExpense());
		assertEquals(YEAR, e7.getYearOfExpense());
		
		Expense e8 = new Expense(ExpenseType.GROCERIES, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.GROCERIES_NAME, e8.getStringExpenseType());
		assertEquals(NAME, e8.getName());
		assertEquals(DESCRIPTION, e8.getDescription());
		assertEquals(AMOUNT, e8.getAmount());
		assertEquals(DOLLAR_AMOUNT, e8.getDollarAmount());
		assertEquals(DAY, e8.getDayOfExpense());
		assertEquals(MONTH, e8.getMonthOfExpense());
		assertEquals(YEAR, e8.getYearOfExpense());
		
		Expense e9 = new Expense(ExpenseType.HEALTH, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.HEALTH_NAME, e9.getStringExpenseType());
		assertEquals(NAME, e9.getName());
		assertEquals(DESCRIPTION, e9.getDescription());
		assertEquals(AMOUNT, e9.getAmount());
		assertEquals(DOLLAR_AMOUNT, e9.getDollarAmount());
		assertEquals(DAY, e9.getDayOfExpense());
		assertEquals(MONTH, e9.getMonthOfExpense());
		assertEquals(YEAR, e9.getYearOfExpense());
		
		Expense e10 = new Expense(ExpenseType.HOME_IMPROVEMENT, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.HOME_IMPROVEMENT_NAME, e10.getStringExpenseType());
		assertEquals(NAME, e10.getName());
		assertEquals(DESCRIPTION, e10.getDescription());
		assertEquals(AMOUNT, e10.getAmount());
		assertEquals(DOLLAR_AMOUNT, e10.getDollarAmount());
		assertEquals(DAY, e10.getDayOfExpense());
		assertEquals(MONTH, e10.getMonthOfExpense());
		assertEquals(YEAR, e10.getYearOfExpense());
		
		Expense e11 = new Expense(ExpenseType.PERSONAL_LIFESTYLE, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.PERSONAL_LIFESTYLE_NAME, e11.getStringExpenseType());
		assertEquals(NAME, e11.getName());
		assertEquals(DESCRIPTION, e11.getDescription());
		assertEquals(AMOUNT, e11.getAmount());
		assertEquals(DOLLAR_AMOUNT, e11.getDollarAmount());
		assertEquals(DAY, e11.getDayOfExpense());
		assertEquals(MONTH, e11.getMonthOfExpense());
		assertEquals(YEAR, e11.getYearOfExpense());
		
		Expense e12 = new Expense(ExpenseType.DINING_OUT, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.DINING_OUT_NAME, e12.getStringExpenseType());
		assertEquals(NAME, e12.getName());
		assertEquals(DESCRIPTION, e12.getDescription());
		assertEquals(AMOUNT, e12.getAmount());
		assertEquals(DOLLAR_AMOUNT, e12.getDollarAmount());
		assertEquals(DAY, e12.getDayOfExpense());
		assertEquals(MONTH, e12.getMonthOfExpense());
		assertEquals(YEAR, e12.getYearOfExpense());
		
		Expense e13 = new Expense(ExpenseType.RECREATION, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.RECREATION_NAME, e13.getStringExpenseType());
		assertEquals(NAME, e13.getName());
		assertEquals(DESCRIPTION, e13.getDescription());
		assertEquals(AMOUNT, e13.getAmount());
		assertEquals(DOLLAR_AMOUNT, e13.getDollarAmount());
		assertEquals(DAY, e13.getDayOfExpense());
		assertEquals(MONTH, e13.getMonthOfExpense());
		assertEquals(YEAR, e13.getYearOfExpense());
		
		Expense e14 = new Expense(ExpenseType.ENTERTAINMENT, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.ENTERTAINMENT_NAME, e14.getStringExpenseType());
		assertEquals(NAME, e14.getName());
		assertEquals(DESCRIPTION, e14.getDescription());
		assertEquals(AMOUNT, e14.getAmount());
		assertEquals(DOLLAR_AMOUNT, e14.getDollarAmount());
		assertEquals(DAY, e14.getDayOfExpense());
		assertEquals(MONTH, e14.getMonthOfExpense());
		assertEquals(YEAR, e14.getYearOfExpense());
		
		Expense e15 = new Expense(ExpenseType.CHILD, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.CHILD_NAME, e15.getStringExpenseType());
		assertEquals(NAME, e15.getName());
		assertEquals(DESCRIPTION, e15.getDescription());
		assertEquals(AMOUNT, e15.getAmount());
		assertEquals(DOLLAR_AMOUNT, e15.getDollarAmount());
		assertEquals(DAY, e15.getDayOfExpense());
		assertEquals(MONTH, e15.getMonthOfExpense());
		assertEquals(YEAR, e15.getYearOfExpense());
		
		Expense e16 = new Expense(ExpenseType.PET, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.PET_NAME, e16.getStringExpenseType());
		assertEquals(NAME, e16.getName());
		assertEquals(DESCRIPTION, e16.getDescription());
		assertEquals(AMOUNT, e16.getAmount());
		assertEquals(DOLLAR_AMOUNT, e16.getDollarAmount());
		assertEquals(DAY, e16.getDayOfExpense());
		assertEquals(MONTH, e16.getMonthOfExpense());
		assertEquals(YEAR, e16.getYearOfExpense());
		
		Expense e17 = new Expense(ExpenseType.MISC, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(Expense.MISC_NAME, e17.getStringExpenseType());
		assertEquals(NAME, e17.getName());
		assertEquals(DESCRIPTION, e17.getDescription());
		assertEquals(AMOUNT, e17.getAmount());
		assertEquals(DOLLAR_AMOUNT, e17.getDollarAmount());
		assertEquals(DAY, e17.getDayOfExpense());
		assertEquals(MONTH, e17.getMonthOfExpense());
		assertEquals(YEAR, e17.getYearOfExpense());
		//Error checking
		Exception ex1 = assertThrows(IllegalArgumentException.class,
				() -> new Expense((ExpenseType)null, NAME, DESCRIPTION, AMOUNT, DAY,
						MONTH, YEAR, RECURRING));
		assertEquals("expenseType is null.", ex1.getMessage());
	}
	/**
	 * Tests for the I/O constructor.
	 */
	@Test
	public void testIOConstructor() {
		//IO constructor
		Expense e1 = new Expense(Expense.HOUSING_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.HOUSING, e1.getExpenseType());
		assertEquals(NAME, e1.getName());
		assertEquals(DESCRIPTION, e1.getDescription());
		assertEquals(AMOUNT, e1.getAmount());
		assertEquals(DOLLAR_AMOUNT, e1.getDollarAmount());
		assertEquals(DAY, e1.getDayOfExpense());
		assertEquals(MONTH, e1.getMonthOfExpense());
		assertEquals(YEAR, e1.getYearOfExpense());
		
		Expense e2 = new Expense(Expense.TRANSPORTATION_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.TRANSPORTATION, e2.getExpenseType());
		assertEquals(NAME, e2.getName());
		assertEquals(DESCRIPTION, e2.getDescription());
		assertEquals(AMOUNT, e2.getAmount());
		assertEquals(DOLLAR_AMOUNT, e2.getDollarAmount());
		assertEquals(DAY, e2.getDayOfExpense());
		assertEquals(MONTH, e2.getMonthOfExpense());
		assertEquals(YEAR, e2.getYearOfExpense());
		
		Expense e3 = new Expense(Expense.INSURANCE_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.INSURANCE, e3.getExpenseType());
		assertEquals(NAME, e3.getName());
		assertEquals(DESCRIPTION, e3.getDescription());
		assertEquals(AMOUNT, e3.getAmount());
		assertEquals(DOLLAR_AMOUNT, e3.getDollarAmount());
		assertEquals(DAY, e3.getDayOfExpense());
		assertEquals(MONTH, e3.getMonthOfExpense());
		assertEquals(YEAR, e3.getYearOfExpense());
		
		Expense e4 = new Expense(Expense.UTILITIES_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.UTILITIES, e4.getExpenseType());
		assertEquals(NAME, e4.getName());
		assertEquals(DESCRIPTION, e4.getDescription());
		assertEquals(AMOUNT, e4.getAmount());
		assertEquals(DOLLAR_AMOUNT, e4.getDollarAmount());
		assertEquals(DAY, e4.getDayOfExpense());
		assertEquals(MONTH, e4.getMonthOfExpense());
		assertEquals(YEAR, e4.getYearOfExpense());
		
		Expense e5 = new Expense(Expense.INVESTMENTS_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.INVESTMENTS, e5.getExpenseType());
		assertEquals(NAME, e5.getName());
		assertEquals(DESCRIPTION, e5.getDescription());
		assertEquals(AMOUNT, e5.getAmount());
		assertEquals(DOLLAR_AMOUNT, e5.getDollarAmount());
		assertEquals(DAY, e5.getDayOfExpense());
		assertEquals(MONTH, e5.getMonthOfExpense());
		assertEquals(YEAR, e5.getYearOfExpense());
		
		Expense e6 = new Expense(Expense.SAVINGS_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.SAVINGS, e6.getExpenseType());
		assertEquals(NAME, e6.getName());
		assertEquals(DESCRIPTION, e6.getDescription());
		assertEquals(AMOUNT, e6.getAmount());
		assertEquals(DOLLAR_AMOUNT, e6.getDollarAmount());
		assertEquals(DAY, e6.getDayOfExpense());
		assertEquals(MONTH, e6.getMonthOfExpense());
		assertEquals(YEAR, e6.getYearOfExpense());
		
		Expense e7 = new Expense(Expense.PROFESSIONAL_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.PROFESSIONAL, e7.getExpenseType());
		assertEquals(NAME, e7.getName());
		assertEquals(DESCRIPTION, e7.getDescription());
		assertEquals(AMOUNT, e7.getAmount());
		assertEquals(DOLLAR_AMOUNT, e7.getDollarAmount());
		assertEquals(DAY, e7.getDayOfExpense());
		assertEquals(MONTH, e7.getMonthOfExpense());
		assertEquals(YEAR, e7.getYearOfExpense());
		
		Expense e8 = new Expense(Expense.GROCERIES_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.GROCERIES, e8.getExpenseType());
		assertEquals(NAME, e8.getName());
		assertEquals(DESCRIPTION, e8.getDescription());
		assertEquals(AMOUNT, e8.getAmount());
		assertEquals(DOLLAR_AMOUNT, e8.getDollarAmount());
		assertEquals(DAY, e8.getDayOfExpense());
		assertEquals(MONTH, e8.getMonthOfExpense());
		assertEquals(YEAR, e8.getYearOfExpense());
		
		Expense e9 = new Expense(Expense.HEALTH_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.HEALTH, e9.getExpenseType());
		assertEquals(NAME, e9.getName());
		assertEquals(DESCRIPTION, e9.getDescription());
		assertEquals(AMOUNT, e9.getAmount());
		assertEquals(DOLLAR_AMOUNT, e9.getDollarAmount());
		assertEquals(DAY, e9.getDayOfExpense());
		assertEquals(MONTH, e9.getMonthOfExpense());
		assertEquals(YEAR, e9.getYearOfExpense());
		
		Expense e10 = new Expense(Expense.HOME_IMPROVEMENT_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.HOME_IMPROVEMENT, e10.getExpenseType());
		assertEquals(NAME, e10.getName());
		assertEquals(DESCRIPTION, e10.getDescription());
		assertEquals(AMOUNT, e10.getAmount());
		assertEquals(DOLLAR_AMOUNT, e10.getDollarAmount());
		assertEquals(DAY, e10.getDayOfExpense());
		assertEquals(MONTH, e10.getMonthOfExpense());
		assertEquals(YEAR, e10.getYearOfExpense());
		
		Expense e11 = new Expense(Expense.PERSONAL_LIFESTYLE_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.PERSONAL_LIFESTYLE, e11.getExpenseType());
		assertEquals(NAME, e11.getName());
		assertEquals(DESCRIPTION, e11.getDescription());
		assertEquals(AMOUNT, e11.getAmount());
		assertEquals(DOLLAR_AMOUNT, e11.getDollarAmount());
		assertEquals(DAY, e11.getDayOfExpense());
		assertEquals(MONTH, e11.getMonthOfExpense());
		assertEquals(YEAR, e11.getYearOfExpense());
		
		Expense e12 = new Expense(Expense.DINING_OUT_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.DINING_OUT, e12.getExpenseType());
		assertEquals(NAME, e12.getName());
		assertEquals(DESCRIPTION, e12.getDescription());
		assertEquals(AMOUNT, e12.getAmount());
		assertEquals(DOLLAR_AMOUNT, e12.getDollarAmount());
		assertEquals(DAY, e12.getDayOfExpense());
		assertEquals(MONTH, e12.getMonthOfExpense());
		assertEquals(YEAR, e12.getYearOfExpense());
		
		Expense e13 = new Expense(Expense.RECREATION_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.RECREATION, e13.getExpenseType());
		assertEquals(NAME, e13.getName());
		assertEquals(DESCRIPTION, e13.getDescription());
		assertEquals(AMOUNT, e13.getAmount());
		assertEquals(DOLLAR_AMOUNT, e13.getDollarAmount());
		assertEquals(DAY, e13.getDayOfExpense());
		assertEquals(MONTH, e13.getMonthOfExpense());
		assertEquals(YEAR, e13.getYearOfExpense());
		
		Expense e14 = new Expense(Expense.ENTERTAINMENT_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.ENTERTAINMENT, e14.getExpenseType());
		assertEquals(NAME, e14.getName());
		assertEquals(DESCRIPTION, e14.getDescription());
		assertEquals(AMOUNT, e14.getAmount());
		assertEquals(DOLLAR_AMOUNT, e14.getDollarAmount());
		assertEquals(DAY, e14.getDayOfExpense());
		assertEquals(MONTH, e14.getMonthOfExpense());
		assertEquals(YEAR, e14.getYearOfExpense());
		
		Expense e15 = new Expense(Expense.CHILD_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.CHILD, e15.getExpenseType());
		assertEquals(NAME, e15.getName());
		assertEquals(DESCRIPTION, e15.getDescription());
		assertEquals(AMOUNT, e15.getAmount());
		assertEquals(DOLLAR_AMOUNT, e15.getDollarAmount());
		assertEquals(DAY, e15.getDayOfExpense());
		assertEquals(MONTH, e15.getMonthOfExpense());
		assertEquals(YEAR, e15.getYearOfExpense());
		
		Expense e16 = new Expense(Expense.PET_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.PET, e16.getExpenseType());
		assertEquals(NAME, e16.getName());
		assertEquals(DESCRIPTION, e16.getDescription());
		assertEquals(AMOUNT, e16.getAmount());
		assertEquals(DOLLAR_AMOUNT, e16.getDollarAmount());
		assertEquals(DAY, e16.getDayOfExpense());
		assertEquals(MONTH, e16.getMonthOfExpense());
		assertEquals(YEAR, e16.getYearOfExpense());
		
		Expense e17 = new Expense(Expense.MISC_NAME, NAME, DESCRIPTION,
				AMOUNT, DAY, MONTH, YEAR, RECURRING);
		assertEquals(ExpenseType.MISC, e17.getExpenseType());
		assertEquals(NAME, e17.getName());
		assertEquals(DESCRIPTION, e17.getDescription());
		assertEquals(AMOUNT, e17.getAmount());
		assertEquals(DOLLAR_AMOUNT, e17.getDollarAmount());
		assertEquals(DAY, e17.getDayOfExpense());
		assertEquals(MONTH, e17.getMonthOfExpense());
		assertEquals(YEAR, e17.getYearOfExpense());
		//Error checking
		Exception ex1 = assertThrows(IllegalArgumentException.class,
				() -> new Expense("Unknown Expense", NAME, DESCRIPTION, AMOUNT, DAY,
						MONTH, YEAR, RECURRING));
		assertEquals("Unknown expense type name.", ex1.getMessage());
	}
}
