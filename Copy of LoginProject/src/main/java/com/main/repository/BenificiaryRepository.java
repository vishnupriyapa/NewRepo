package com.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.model.Benificiary;
import com.main.model.Transaction;

public interface BenificiaryRepository extends CrudRepository<Benificiary, Integer>{


}
