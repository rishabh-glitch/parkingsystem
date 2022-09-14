package com.backend.parkingsystem.service;

import java.util.List;

import com.backend.parkingsystem.entity.Login;
import com.backend.parkingsystem.entity.ParkingFloor;
import com.backend.parkingsystem.entity.ParkingPremise;
import com.backend.parkingsystem.entity.User;
import com.backend.parkingsystem.exceptions.DuplicateParkingFloorException;
import com.backend.parkingsystem.exceptions.DuplicateParkingPremiseException;
import com.backend.parkingsystem.exceptions.InvalidLoginCredintialException;
import com.backend.parkingsystem.exceptions.NoSuchParkingFloorException;
import com.backend.parkingsystem.exceptions.NoSuchParkingPremiseException;
import com.backend.parkingsystem.exceptions.NoSuchUserException;

public interface AdminService {
	public boolean login(Login login) throws InvalidLoginCredintialException;

	public boolean blockUser(User user) throws NoSuchUserException;

	// Parking Premise
	public boolean addParkingPremise(ParkingPremise parkingPremise) throws DuplicateParkingPremiseException;

	public ParkingPremise getParkingPremiseById(long parkingPremiseId) throws NoSuchParkingPremiseException;

	public List<ParkingPremise> getParkingPremiseByName(String premiseName) throws NoSuchParkingPremiseException;

	public List<ParkingPremise> getAllParkingPremises();

	public ParkingPremise modifyParkingPremise(ParkingPremise parkingPremise);

	public boolean removeParkingPremise(int parkingPremiseId) throws NoSuchParkingPremiseException;

	// Parking Floor
	public boolean addParkingFloor(ParkingFloor parkingFloor) throws DuplicateParkingFloorException;

	public ParkingFloor getParkingFloorById(long parkingFloorId) throws NoSuchParkingFloorException;

	public List<ParkingFloor> getParkingFloorByNumber(long parkingPremiseId, String floorNumber)
			throws NoSuchParkingFloorException;

	public List<ParkingFloor> getAllParkingFloors(long parkingPremiseId);

	public ParkingFloor modifyParkingCapacity(ParkingFloor parkingFloor);

	public boolean removeParkingFloor(long parkingFloorId) throws NoSuchParkingPremiseException;

}
