package com.damian.banking;

public interface BankingService {

	void pay(Payment payment) throws PaymentException;
	
}
