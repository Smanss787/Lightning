package com.udev.lightning.exceptions;

public class MessageNotFoundException extends RuntimeException {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MessageNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
