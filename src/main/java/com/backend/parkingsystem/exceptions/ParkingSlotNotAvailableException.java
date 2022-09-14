package com.backend.parkingsystem.exceptions;

public class ParkingSlotNotAvailableException extends Exception {
	public ParkingSlotNotAvailableException(String message) {
		super(message);
	}
}
