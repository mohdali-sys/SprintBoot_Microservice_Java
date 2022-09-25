package com.example.demo.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.customer.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
