package com.damian.invoices;

import org.springframework.stereotype.Component;

import com.damian.banking.Payment;
import com.damian.banking.PaymentCreator;
import com.damian.banking.PaymentException;

@Component
public class LocalPaymentCreator implements PaymentCreator{

	private static final String CURRENT_LOCAL_ACC = "current-local-acc";
	
	@Override
	public Payment createPayment(Invoice invoice) throws PaymentException {
		
		if (invoice.getAccount() == null) {
			throw new PaymentException("Account can not be empty when creating a local payment!");
		}
		
		return new Payment(CURRENT_LOCAL_ACC, invoice.getAccount(), invoice.getDollars());
	}

}
