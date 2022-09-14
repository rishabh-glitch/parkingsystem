package com.backend.parkingsystem.repository;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.backend.parkingsystem.entity.Payment;

public interface PaymentDao {
	public boolean parkingBookingPayment(Payment payment) throws SQLException;

	public Payment readPaymentById(long paymentId) throws SQLException;

	public List<Payment> readPaymentByDate(Date paymentDate) throws SQLException;

}
