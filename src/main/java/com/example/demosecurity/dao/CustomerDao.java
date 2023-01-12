package com.example.demosecurity.dao;

import com.example.demosecurity.ds.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

    Optional<Customer> findCustomerByUsername(String username);
}
