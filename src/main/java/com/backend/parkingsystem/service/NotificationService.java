package com.backend.parkingsystem.service;

import com.backend.parkingsystem.entity.ParkingSlots;
import com.backend.parkingsystem.entity.User;
import com.backend.parkingsystem.exceptions.NotificationException;

public interface NotificationService {
	public void sendRegistrationEmail(User user) throws NotificationException;

	public void sendParkingConfirmationEmail(User user, ParkingSlots slot) throws NotificationException;

	public void sendParkingCancellationEmail(User user, ParkingSlots slot) throws NotificationException;

	public void sendForgotPasswordEmail(User user) throws NotificationException;

	public void sendLoginIdEmail(String email) throws NotificationException;
}
