package com.merin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Customers {
public int Custid;
public String CustName;
@Autowired
public Technologies techdetails;
public Technologies getTechdetails() {
	return techdetails;
}
public void setTechdetails(Technologies techdetails) {
	this.techdetails = techdetails;
}
public int getCustid() {
	return Custid;
}
public void setCustid(int custid) {
	Custid = custid;
}
public String getCustName() {
	return CustName;
}
public void setCustName(String custName) {
	CustName = custName;
}
@Override
public String toString() {
	return "Customers [Custid=" + Custid + ", CustName=" + CustName + "]";
}
public void details()
{
	System.out.println("customers object is returned");
	techdetails.tech();
}
}
