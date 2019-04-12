package com.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.model.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer>{

}
