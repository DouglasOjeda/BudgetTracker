package com.douglasojeda.budget_tracker.exception;
/**
 * Exception is used when there is a field that doesn't have a corresponding String name
 * constant that can be used for display.
 * @author douglasojeda
 */
public class NoMatchingStringNameException extends RuntimeException {
	/** Serial version UID */
	private static final long serialVersionUID = 1L;
	/** Default message for exception */
	private static final String DEFAULT_MESSAGE = "There is no matching String name for " +
												  "this field.";
	/**
	 * Constructs a NoMatchingStringNameException with the default message.
	 */
	public NoMatchingStringNameException() {
		this(DEFAULT_MESSAGE);
	}
	/**
	 * Constructs a NoMatchingStringNameException with custom message.
	 * @param message the message for the Exception
	 */
	public NoMatchingStringNameException(String message) {
		super(message);
	}
}
