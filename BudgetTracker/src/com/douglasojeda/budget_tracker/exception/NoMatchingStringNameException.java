package com.douglasojeda.budget_tracker.exception;
/**
 * TODO
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
	public NoMatchingStringNameException(String message) {
		super(message);
	}
}
