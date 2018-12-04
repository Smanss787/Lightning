package com.udev.lightning.exceptions;

public class MessageIdMismatchException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MessageIdMismatchException(String message) {
        super(message);
    }
}
