package com.main.service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.AccountDaoInt;
import com.main.model.Account;
import com.main.model.Benificiary;
import com.main.model.Transaction;

@Service
@Transactional
public class AccountServiceImpl implements AccountServiceInt{
@Autowired
AccountDaoInt dao;

	public void createAcc(HttpServletRequest req,int id) {
		dao.createAcc(req,id);
	}

	@Override
	public Account findById(int id,String s) {
		return dao.findById(id,s);
	}

	@Override
	public void createAccWithin(HttpServletRequest request, int id,Benificiary ben) {
		dao.createAccWithin(request,id,ben);
		
	}

	@Override
	public void createAccOutside(HttpServletRequest request, int id, Benificiary ben) {
		dao.createAccOutside(request,id,ben);
		
	}

	@Override
	public void saveTranWithin(HttpServletRequest request, int id, Transaction tran,Account ac) {
		dao.saveTranWithin(request,id,tran,ac);
		
	}

}
