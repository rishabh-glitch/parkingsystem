package com.backend.parkingsystem.service;

import java.util.Date;
import java.util.List;

import com.backend.parkingsystem.entity.ParkingFloor;
import com.backend.parkingsystem.entity.ParkingPremise;
import com.backend.parkingsystem.entity.ParkingSlots;
import com.backend.parkingsystem.exceptions.NoSuchParkingSlotException;
import com.backend.parkingsystem.exceptions.ParkingSlotNotAvailableException;

public interface ParkingService {
	public boolean checkAvailability(Date date, String time) throws ParkingSlotNotAvailableException;

	public boolean bookParkingSlot(ParkingSlots slot) throws ParkingSlotNotAvailableException;

	public boolean cancelParkingSlotBooking(ParkingSlots slot) throws NoSuchParkingSlotException;

	public List<ParkingSlots> getAllParkingSlotsByPremise(ParkingPremise parkingPremise);

	public List<ParkingSlots> getAllParkingSlotsByFloor(ParkingFloor parkingFloor);

	public ParkingSlots getParkingSlotsById(long parkingSlotId) throws NoSuchParkingSlotException;

}
