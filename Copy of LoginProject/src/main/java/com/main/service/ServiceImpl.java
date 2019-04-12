package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.DaoIntf;
import com.main.model.Registration;

@Service
@Transactional
public class ServiceImpl implements ServiceIntf{
@Autowired
DaoIntf dao;


public void saveEmp(Registration reg) {
	dao.saveEmp(reg);
	
}


@Override
public List<Registration> display() {
	
	return dao.display();
}


@Override
public Registration edit(int id) {
	
	return dao.edit(id);
}


@Override
public Registration check(Registration reg) {
	
	return dao.check(reg);
}



public void update(int id) {
	
}


@Override
public Registration findById(int id) {
	
	return dao.findById(id);
}
}
