package com.main.model;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Registration")
public class Registration {
     public Registration() {
		super();
		
	}
	public Registration(String firstName, String lastName, Date dob, String addressLine1, String addressLine2,
			String city, String state, int pincode, long mobileNo, String email, String userName, String password,
			long aadhar, String pan, String aadharProof, String panProof, String dobProof, String addressProof) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.aadhar = aadhar;
		this.pan = pan;
		this.aadharProof = aadharProof;
		this.panProof = panProof;
		this.dobProof = dobProof;
		this.addressProof = addressProof;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadharProof() {
		return aadharProof;
	}
	public void setAadharProof(String aadharProof) {
		this.aadharProof = aadharProof;
	}
	public String getPanProof() {
		return panProof;
	}
	public void setPanProof(String panProof) {
		this.panProof = panProof;
	}
	public String getDobProof() {
		return dobProof;
	}
	public void setDobProof(String dobProof) {
		this.dobProof = dobProof;
	}
	public String getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}
	@Id
     @GeneratedValue(strategy=GenerationType.AUTO)
private int id;   
private String firstName;  
private String lastName;   
@DateTimeFormat(pattern="dd-MM-yyyy")
private Date dob;   
private String addressLine1;   
private String addressLine2;    
private String city;  
private String state;   
private int pincode;     
private long mobileNo;     
private String email;
private String userName; 
private String password;   
private long aadhar; 
private String pan;  
private String aadharProof;    
private String panProof;
private String dobProof;
private String addressProof;
@OneToMany(mappedBy="registration",cascade=CascadeType.ALL)
private List<Account> account;

public List<Account> getAccount() {
	return account;
}
public void setAccount(List<Account> account) {
	this.account = account;
}
public List<Benificiary> getBenificiary() {
	return benificiary;
}
public void setBenificiary(List<Benificiary> benificiary) {
	this.benificiary = benificiary;
}
public List<Transaction> getTransactions() {
	return transactions;
}
public void setTransactions(List<Transaction> transactions) {
	this.transactions = transactions;
}
@OneToMany(mappedBy="registration",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private List<Benificiary> benificiary;

@OneToMany(mappedBy="registration",cascade=CascadeType.ALL)
private List<Transaction> transactions;

}

