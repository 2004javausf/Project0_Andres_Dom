package com.revature.beans;

import java.io.Serializable;

import com.revature.menu.AdminMenu;
import com.revature.service.FindCustomer;

//import com.revature.util.FileStuff;
//import com.revature.util.Roster;

public class Customer implements Serializable  {
	
	private static final long serialVersionUID = 7860983731751619324L;

	
	private String customerName;
	private String phoneNumber;
	private String userName;
	private String password;
	private String accountType;
	private String accStatus;
	private String address;
	

	
	public void profileInfo(){
		
		FindCustomer.signUpForm.add(this);
		AdminMenu.writeToFile(FindCustomer.signUpForm);
	}
	
	public void profileInfo(String customerName, String address, String phoneNumber, String userName, 
			String password, String accountType, String accStatus) {
		
		this.customerName=customerName;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.userName=userName;
		this.password=password;
		this.accountType=accountType;
		this.accStatus=accStatus;
		FindCustomer.signUpForm.add(this);
		AdminMenu.writeToFile(FindCustomer.signUpForm);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	@Override
	public String toString() {
		return "Customer Information [customerName=" + customerName + ", address=" + address + ", phoneNumber=" + phoneNumber + ", userName=" + userName
				+ ", password=" + password + ", accountType=" + accountType + ", accStatus=" + accStatus + "]";
	}
	
		
	
}
