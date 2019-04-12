package com.main.service;

import javax.servlet.http.HttpServletRequest;

import com.main.model.Account;
import com.main.model.Benificiary;
import com.main.model.Transaction;

public interface AccountServiceInt {

	void createAcc(HttpServletRequest req,int id);

	Account findById(int id, String string);

	void createAccWithin(HttpServletRequest request, int id,Benificiary ben);

	void createAccOutside(HttpServletRequest request, int id, Benificiary ben);

	void saveTranWithin(HttpServletRequest request, int id, Transaction tran, Account r);

}
