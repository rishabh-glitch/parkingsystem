package com.backend.parkingsystem.entity;

import java.util.Date;

public class Payment {
	private long paymentId;
	private PaymentType type;
	private Date paymentDateTime;
	private double amountPaid;
	private PaymentStatus status;
}
