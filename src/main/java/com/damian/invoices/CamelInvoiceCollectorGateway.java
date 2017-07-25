package com.damian.invoices;

import java.util.Collection;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Component;

@Component
public class CamelInvoiceCollectorGateway implements InvoiceCollectorGateway {

	@Produce(uri = "seda:newInvoiceChannel")
	ProducerTemplate produceTemplate;
	
	@Override
	public void collectInvoices(Collection<Invoice> invoices) {
		produceTemplate.sendBody(invoices);
	}

}
