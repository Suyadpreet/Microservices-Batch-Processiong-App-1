package com.suyad.config;

import org.springframework.batch.item.ItemProcessor;

import com.suyad.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> 
{

	@Override
	public Customer process(Customer item) throws Exception
	{
		// write any data processing logic if you want
		return item;
	}

}
