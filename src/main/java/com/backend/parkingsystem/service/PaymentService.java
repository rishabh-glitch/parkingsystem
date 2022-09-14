package com.backend.parkingsystem.service;

import java.util.Date;
import java.util.List;

import com.backend.parkingsystem.entity.Payment;
import com.backend.parkingsystem.exceptions.NoSuchPaymentFoundException;
import com.backend.parkingsystem.exceptions.PaymentFailureException;

public interface PaymentService {
	public boolean parkingBookingPayment(Payment payment) throws PaymentFailureException;

	public Payment findPaymentById(long paymentId) throws NoSuchPaymentFoundException;

	public List<Payment> findPaymentByDate(Date paymentDate) throws NoSuchPaymentFoundException;
}
