package com.main.model;


import java.util.Date;

import javax.persistence.*;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long accountNo;  
    private int tenure;    
    private float interest;    
    private Date matureDate;   
    private Date updatedDate;   
    private long termAmt;   
    private String accountType;
    public Account() {
		super();
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public Date getMatureDate() {
		return matureDate;
	}
	public void setMatureDate(Date matureDate) {
		this.matureDate = matureDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public long getTermAmt() {
		return termAmt;
	}
	public void setTermAmt(long termAmt) {
		this.termAmt = termAmt;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Registration getRegister() {
		return registration;
	}
	public void setRegister(Registration registration) {
		this.registration = registration;
	}
	public Account(long accountNo, int tenure, float interest, Date matureDate, Date updatedDate, long termAmt,
			String accountType, long balance, Date createdDate, Registration registration) {
		super();
		this.accountNo = accountNo;
		this.tenure = tenure;
		this.interest = interest;
		this.matureDate = matureDate;
		this.updatedDate = updatedDate;
		this.termAmt = termAmt;
		this.accountType = accountType;
		this.balance = balance;
		this.createdDate = createdDate;
		this.registration = registration;
	}
	private long balance;    
    private Date createdDate;   
    @OneToOne(fetch=FetchType.EAGER)
    private Registration registration;
}
