package com.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.model.Registration;

public interface CustomerRepository extends CrudRepository<Registration, Integer>{

	Registration findById(int id);

	Registration findByUserNameAndPassword(String userName, String password);

}
