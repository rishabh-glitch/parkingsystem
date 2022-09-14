package com.backend.parkingsystem.exceptions;

public class NoSuchPaymentFoundException extends Exception {
	public NoSuchPaymentFoundException(String message) {
		super(message);
	}
}
