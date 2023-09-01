package com.ex.Renovation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.Renovation.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}