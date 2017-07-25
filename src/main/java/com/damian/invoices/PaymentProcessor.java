package com.damian.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.damian.banking.BankingService;
import com.damian.banking.Payment;
import com.damian.banking.PaymentException;

@Component
public class PaymentProcessor {
 
    @Autowired
    BankingService bankingService;
 
    public void processPayment(Payment payment) throws PaymentException {
        bankingService.pay(payment);
    }
 
}