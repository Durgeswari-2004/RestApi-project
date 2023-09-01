package com.ex.Renovation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ex.Renovation.Model.Customer;
import com.ex.Renovation.Repositories.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	public List<Customer> getproducts() {
		return  customerRepository .findAll();
	}

	public List<Customer> saveinfo(List<Customer> product) {
		return  customerRepository.saveAll(product);
	}

	
}