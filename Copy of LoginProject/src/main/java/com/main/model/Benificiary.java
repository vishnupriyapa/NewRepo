package com.main.model;



import javax.persistence.*;
import com.main.model.*;
@Entity
public class Benificiary {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bId; 
private String name;
private long accnum;
private long reEnteraccnum;
private String email;
private String ifsc;
private String remarks;
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAccnum() {
	return accnum;
}
public void setAccnum(long accnum) {
	this.accnum = accnum;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
@ManyToOne
@JoinColumn(name="id")
private Registration registration; 
public Registration getRegistration() {
	return registration;
}
public long getReEnteraccnum() {
	return reEnteraccnum;
}
public void setReEnteraccnum(long reEnteraccnum) {
	this.reEnteraccnum = reEnteraccnum;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setRegistration(Registration registration) {
	this.registration = registration;
}

}
