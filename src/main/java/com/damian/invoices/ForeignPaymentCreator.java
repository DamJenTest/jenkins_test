package com.damian.invoices;

import org.springframework.stereotype.Component;

import com.damian.banking.Payment;
import com.damian.banking.PaymentCreator;
import com.damian.banking.PaymentException;

@Component
public class ForeignPaymentCreator implements PaymentCreator {

	// hard coded account value for demo purposes
	private static final String CURRENT_IBAN_ACC = "current-iban-acc";

	@Override
	public Payment createPayment(Invoice invoice) throws PaymentException {
		if (null == invoice.getIban()) {
			throw new PaymentException("IBAN mustn't be null when creating foreign payment!");
		}

		return new Payment(CURRENT_IBAN_ACC, invoice.getIban(), invoice.getDollars());
	}

}