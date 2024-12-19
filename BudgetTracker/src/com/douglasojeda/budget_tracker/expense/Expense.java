package com.douglasojeda.budget_tracker.expense;
/**
 * Expense is a POJO, that encapsulates a purchase. 
 * Expense has a type, name, and description. An Expense also holds the day, month,
 * and year in which it was created. An Expense also keeps whether it is recurring.
 * @author douglasojeda
 */
public class Expense {
	/**
	 * Types of Expenses.
	 * {@link #HOUSING}
	 * {@link #TRANSPORTATION}
	 * {@link #INSURANCE}
	 * {@link #UTILITIES}
	 * {@link #INVESTMENTS}
	 * {@link #SAVINGS}
	 * {@link #PROFESTIONAL}
	 * {@link #GROCERIES}
	 * {@link #HEALTH}
	 * {@link #HOME_IMPROVEMENT}
	 * {@link #PERSONAL_LIFESTYLE}
	 * {@link #DINING_OUT}
	 * {@link #RECREATION}
	 * {@link #ENTERTAINMENT}
	 * {@link #CHILD}
	 * {@link #PET}
	 * {@link #MISC}
	 */
	public enum ExpenseType {
		/** Housing Expense */
		HOUSING,
		/** Transportation Expense */
		TRANSPORTATION,
		/** Insurance Expense */
		INSURANCE,
		/** Utilities Expense */
		UTILITIES,
		/** Investments Expense */
		INVESTMENTS,
		/** Savings Expense */
		SAVINGS,
		/** Professional Expense */
		PROFESSIONAL,
		/** Groceries Expense */
		GROCERIES,
		/** Health Expense */
		HEALTH,
		/** Home improvement Expense */
		HOME_IMPROVEMENT,
		/** Personal lifestyle Expense */
		PERSONAL_LIFESTYLE,
		/** Dining out Expense */
		DINING_OUT,
		/** Recreation Expense */
		RECREATION,
		/** Entertainment Expense */
		ENTERTAINMENT,
		/** Child Expense */
		CHILD,
		/** Pet Expense */
		PET,
		/** Misc Expense */
		MISC
	}
	/** Housing name for display purposes */
	public static final String HOUSING_NAME = "Housing";
	/** Transportation name for display purposes */
	public static final String TRANSPORTATION_NAME = "Transportation";
	/** Insurance name for display purposes */
	public static final String INSURANCE_NAME = "Insurance";
	/** Utilities name for display purposes */
	public static final String UTILITIES_NAME = "Utilities";
	/** Investments name for display purposes */
	public static final String INVESTMENTS_NAME = "Investments";
	/** Savings name for display purposes */
	public static final String SAVINGS_NAME = "Savings";
	/** Professional name for display purposes */
	public static final String PROFESSIONAL_NAME = "Professional";
	/** Groceries name for display purposes */
	public static final String GROCERIES_NAME = "Groceries";
	/** Health name for display purposes */
	public static final String HEALTH_NAME = "Health";
	/** Home improvement name for display purposes */
	public static final String HOME_IMPROVEMENT_NAME = "Home improvement";
	/** Personal lifestyle name for display purposes */
	public static final String PERSONAL_LIFESTYLE_NAME = "Personal lifestyle";
	/** Dining out name for display purposes */
	public static final String DINING_OUT_NAME = "Dining out";
	/** Recreation name for display purposes */
	public static final String RECREATION_NAME = "Recreation";
	/** Entertainment name for display purposes */
	public static final String ENTERTAINMENT_NAME = "Entertainment";
	/** Child name for display purposes */
	public static final String CHILD_NAME = "Child";
	/** Pet name for display purposes */
	public static final String PET_NAME = "Pet";
	/** Misc name for display purposes */
	public static final String MISC_NAME = "Misc";
	/** The type of Expense */
	private ExpenseType expenseType;
	/** The name of the Expense */
	private String name;
	/** The description of the Expense */
	private String description;
	/** Amount of Expense in cents */
	private int amount;
	/** The day the Expense took place */
	private int dayOfExpense;
	/** The month the Expense took place */
	private int monthOfExpense;
	/** The year the Expense took place */
	private int yearOfExpense;
	/** Whether the Expense is reccuring */
	private boolean reccuring;
	/**
	 * Constructs an expense with all fields.
	 * @param expenseType the Expense's type
	 * @param name the Expense's name
	 * @param description the Expense's description
	 * @param amount the Expense's amount
	 * @param dayOfExpense the day the Expense happened
	 * @param monthOfExpense the month the Expense happened
	 * @param yearOfExpense the year the Expense happened
	 * @param reccuring whether Expense is recurring
	 */
	public Expense(ExpenseType expenseType, String name, String description, int amount,
			int dayOfExpense, int monthOfExpense, int yearOfExpense, boolean reccuring) {
		setExpenseType(expenseType);
		setName(name);
		setDescription(description);
		setAmount(amount);
		setDayOfExpense(dayOfExpense);
		setMonthOfExpense(monthOfExpense);
		setYearOfExpense(yearOfExpense);
		setReccuring(reccuring);
	}
	/**
	 * Constructs an expense with all fields. Used for File I/O.
	 * @param expenseType the Expense's type
	 * @param name the Expense's name
	 * @param description the Expense's description
	 * @param amount the Expense's amount
	 * @param dayOfExpense the day the Expense happened
	 * @param monthOfExpense the month the Expense happened
	 * @param yearOfExpense the year the Expense happened
	 * @param reccuring whether Expense is recurring
	 */
	public Expense(String expenseType, String name, String description, int amount,
			int dayOfExpense, int monthOfExpense, int yearOfExpense, boolean reccuring) {
		setExpenseType(expenseType);
		setName(name);
		setDescription(description);
		setAmount(amount);
		setDayOfExpense(dayOfExpense);
		setMonthOfExpense(monthOfExpense);
		setYearOfExpense(yearOfExpense);
		setReccuring(reccuring);
	}
	/**
	 * Returns the Expense's type.
	 * @return the expenseType
	 */
	public ExpenseType getExpenseType() {
		return expenseType;
	}
	public String getStringExpenseType() {
		switch (expenseType) {
		case HOUSING:
			return HOUSING_NAME;
		case TRANSPORTATION:
			return TRANSPORTATION_NAME;
		case INSURANCE:
			return INSURANCE_NAME;
		case UTILITIES:
			return UTILITIES_NAME;
		case INVESTMENTS:
			return INVESTMENTS_NAME;
		case SAVINGS:
			return SAVINGS_NAME;
		case PROFESSIONAL:
			return PROFESSIONAL_NAME;
		case GROCERIES:
			return GROCERIES_NAME;
		case HEALTH:
			return HEALTH_NAME;
		case HOME_IMPROVEMENT:
			return HOME_IMPROVEMENT_NAME;
		case PERSONAL_LIFESTYLE:
			return PERSONAL_LIFESTYLE_NAME;
		case DINING_OUT:
			return DINING_OUT_NAME;
		case RECREATION:
			return RECREATION_NAME;
		case ENTERTAINMENT:
			return ENTERTAINMENT_NAME;
		case CHILD:
			return CHILD_NAME;
		case PET:
			return PET_NAME;
		case MISC:
			return MISC_NAME;
		default:
			return null;
		}
	}
	/**
	 * Sets the Expense's type.
	 * @param expenseType the expenseType to set
	 */
	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}
	/**
	 * Sets the Expense's type from a String.
	 * @param expenseType the expenseType to set
	 */
	public void setExpenseType(String expenseType) {
		switch (expenseType) {
		case HOUSING_NAME:
			this.expenseType = ExpenseType.HOUSING;
			break;
		case TRANSPORTATION_NAME:
			this.expenseType = ExpenseType.TRANSPORTATION;
			break;
		case INSURANCE_NAME:
			this.expenseType = ExpenseType.INSURANCE;
			break;
		case UTILITIES_NAME:
			this.expenseType = ExpenseType.UTILITIES;
			break;
		case INVESTMENTS_NAME:
			this.expenseType = ExpenseType.INVESTMENTS;
			break;
		case SAVINGS_NAME:
			this.expenseType = ExpenseType.SAVINGS;
			break;
		case PROFESSIONAL_NAME:
			this.expenseType = ExpenseType.PROFESSIONAL;
			break;
		case GROCERIES_NAME:
			this.expenseType = ExpenseType.GROCERIES;
			break;
		case HEALTH_NAME:
			this.expenseType = ExpenseType.HEALTH;
			break;
		case HOME_IMPROVEMENT_NAME:
			this.expenseType = ExpenseType.HOME_IMPROVEMENT;
			break;
		case PERSONAL_LIFESTYLE_NAME:
			this.expenseType = ExpenseType.PERSONAL_LIFESTYLE;
			break;
		case DINING_OUT_NAME:
			this.expenseType = ExpenseType.DINING_OUT;
			break;
		case RECREATION_NAME:
			this.expenseType = ExpenseType.RECREATION;
			break;
		case ENTERTAINMENT_NAME:
			this.expenseType = ExpenseType.ENTERTAINMENT;
			break;
		case CHILD_NAME:
			this.expenseType = ExpenseType.CHILD;
			break;
		case PET_NAME:
			this.expenseType = ExpenseType.PET;
			break;
		case MISC_NAME:
			this.expenseType = ExpenseType.MISC;
			break;
		default:
			throw new IllegalArgumentException("Unknown expense type name.");
		}
	}
	/**
	 * Returns the Expense's name.
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the Expense's name.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Returns the Expense's description.
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Sets the Expense's description.
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Returns the Expense's amount.
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * Returns the Expense's amount in dollars.
	 * @return the amount in dollars
	 */
	public double getDollarAmount() {
		return amount / 100.0;
	}
	/**
	 * Sets the Expense's amount with cents.
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * Sets the Expense's amount with dollars.
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = (int)(amount * 100);
	}
	/**
	 * Returns the day the of the Expense.
	 * @return the dayOfExpense
	 */
	public int getDayOfExpense() {
		return dayOfExpense;
	}
	/**
	 * Sets the day of the Expense.
	 * @param dayOfExpense the dayOfExpense to set
	 */
	public void setDayOfExpense(int dayOfExpense) {
		this.dayOfExpense = dayOfExpense;
	}
	/**
	 * Returns the month of the Expense.
	 * @return the monthOfExpense
	 */
	public int getMonthOfExpense() {
		return monthOfExpense;
	}
	/**
	 * Sets the month of the Expense.
	 * @param monthOfExpense the monthOfExpense to set
	 */
	public void setMonthOfExpense(int monthOfExpense) {
		this.monthOfExpense = monthOfExpense;
	}
	/**
	 * Returns the year of the Expense.
	 * @return the yearOfExpense
	 */
	public int getYearOfExpense() {
		return yearOfExpense;
	}
	/**
	 * Sets the year of the Expense.
	 * @param yearOfExpense the yearOfExpense to set
	 */
	public void setYearOfExpense(int yearOfExpense) {
		this.yearOfExpense = yearOfExpense;
	}
	/**
	 * Returns whether the Expense is recurring.
	 * @return whether reccuring
	 */
	public boolean isReccuring() {
		return reccuring;
	}
	/**
	 * Sets whether the Expense is recurring
	 * @param reccuring the reccuring to set
	 */
	public void setReccuring(boolean reccuring) {
		this.reccuring = reccuring;
	}
	/**
	 * Returns String representation of Expense.
	 * @return the String representation of Expense
	 */
	@Override
	public String toString() {
		return String.format("%04d,%02d,%02d,%s,%s,%d\n%s", yearOfExpense, monthOfExpense,
				yearOfExpense, getStringExpenseType(), name, amount, description);
	}
	
}