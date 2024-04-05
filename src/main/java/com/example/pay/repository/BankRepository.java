package com.example.pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pay.model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

}
