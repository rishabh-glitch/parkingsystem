package com.backend.parkingsystem.repository;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.backend.parkingsystem.entity.ParkingFloor;
import com.backend.parkingsystem.entity.ParkingPremise;
import com.backend.parkingsystem.entity.ParkingSlots;

public interface ParkingDao {
	public boolean checkAvailability(Date date, String time) throws SQLException;

	public boolean bookParkingSlot(ParkingSlots slot) throws SQLException;

	public boolean cancelParkingSlotBooking(ParkingSlots slot) throws SQLException;

	public List<ParkingSlots> readAllParkingSlotsByPremise(ParkingPremise parkingPremise);

	public List<ParkingSlots> readAllParkingSlotsByFloor(ParkingFloor parkingFloor);

	public ParkingSlots readParkingSlotsById(long parkingSlotId) throws SQLException;

}
