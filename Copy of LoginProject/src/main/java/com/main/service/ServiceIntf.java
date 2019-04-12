package com.main.service;

import java.util.List;

import com.main.model.Registration;

public interface ServiceIntf {

	void saveEmp(Registration reg);

	List<Registration> display();

	Registration edit(int id);

	Registration check(Registration reg);

	void update(int id);

	Registration findById(int id);

}
