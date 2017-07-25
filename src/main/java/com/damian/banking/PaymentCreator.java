package com.damian.banking;

import com.damian.invoices.Invoice;

public interface PaymentCreator {

	Payment createPayment(Invoice invoice) throws PaymentException;
	
}
