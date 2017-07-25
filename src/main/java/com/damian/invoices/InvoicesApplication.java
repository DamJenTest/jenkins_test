package com.damian.invoices;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InvoicesApplication {
	 
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/invoices-context.xml");
    }
 
}