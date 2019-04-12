package com.main.model;

import javax.persistence.*;

@Entity
public class Transaction {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int tId;
private long accountNo;
private String benificiaryName;
private String accountType;
private String ifsc;
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}
public Registration getRegistration() {
	return registration;
}
public void setRegistration(Registration registration) {
	this.registration = registration;
}
private String transferDescription;
private long transferAmount;
public Transaction() {
	super();
}
public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getBenificiaryName() {
	return benificiaryName;
}
public void setBenificiaryName(String benificiaryName) {
	this.benificiaryName = benificiaryName;
}
public String getTransferDescription() {
	return transferDescription;
}
public void setTransferDescription(String transferDescription) {
	this.transferDescription = transferDescription;
}
public long getTransferAmount() {
	return transferAmount;
}
public void setTransferAmount(long transferAmount) {
	this.transferAmount = transferAmount;
}
@ManyToOne
@JoinColumn(name="id")
private Registration registration; 
}
