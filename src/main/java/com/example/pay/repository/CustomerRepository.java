package com.example.pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pay.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
