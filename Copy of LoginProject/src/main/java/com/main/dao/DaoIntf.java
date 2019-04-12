package com.main.dao;

import java.util.List;

import com.main.model.Registration;

public interface DaoIntf {

	void saveEmp(Registration reg);

	List<Registration> display();

	Registration edit(int id);

	Registration check(Registration reg);

	Registration findById(int id);


}
