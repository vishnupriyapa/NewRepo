package com.main.dao;

import java.time.LocalDate;
import java.util.Base64;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Registration;
import com.main.repository.CustomerRepository;

@Repository
public class DaoImpl implements DaoIntf{
@Autowired
CustomerRepository repo;


public void saveEmp(Registration reg) {
	repo.save(reg);
	
}


public List<Registration> display() {
	List<Registration>ls=(List<Registration>) repo.findAll();
	return ls;
}


public Registration edit(int id) {
	Registration r=repo.findById(id);	
	return r;
}


@Override
public Registration check(Registration reg) {
	
	Registration r=repo.findByUserNameAndPassword(reg.getUserName(),Base64.getEncoder().encodeToString(reg.getPassword().getBytes()));	
	return r;
}


@Override
public Registration findById(int id) {
	Registration r=repo.findById(id);
	return r;
}
}
