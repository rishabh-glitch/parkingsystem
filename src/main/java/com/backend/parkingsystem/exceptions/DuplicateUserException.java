package com.backend.parkingsystem.exceptions;

public class DuplicateUserException extends Exception {
	public DuplicateUserException(String message) {
		super(message);
	}
}
