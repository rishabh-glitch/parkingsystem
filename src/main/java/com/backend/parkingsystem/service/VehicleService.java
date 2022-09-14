package com.backend.parkingsystem.service;

import java.util.List;

import com.backend.parkingsystem.entity.Vehicle;
import com.backend.parkingsystem.exceptions.DuplicateVehicleException;
import com.backend.parkingsystem.exceptions.NoSuchVehicleException;

public interface VehicleService {
	public boolean addUsersVehicle(Vehicle vehicle) throws DuplicateVehicleException;

	public Vehicle findVehicleByVehicleNumber(String vehicleNumber, int userId) throws NoSuchVehicleException;

	public List<Vehicle> findAllVehiclesByUserId(int ownerId);

	public boolean removeVehicleByVehicleNumber(String vehicleNumber, int userId) throws NoSuchVehicleException;

	public Vehicle modifyVehicle(Vehicle vehicle);
}
