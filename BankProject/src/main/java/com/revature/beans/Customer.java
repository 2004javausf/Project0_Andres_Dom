package com.revature.beans;

import java.io.IOException;
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
	private Boolean accStatus;
	private String address;
	private String accNumber;
	private double initialDeposit;
	private double balance;
	

	
	public void profileInfo(){
		
		/*FindCustomer.signUpForm.add(this);
		try {
			AdminMenu.writeToFile(FindCustomer.signUpForm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	public void profileInfo(String customerName, String address, String phoneNumber, String userName, 
			String password, String accountType, Boolean accStatus, String accNumber, double initialDeposit, double balance) {
		
		this.customerName=customerName;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.userName=userName;
		this.password=password;
		this.accountType=accountType;
		this.accStatus=accStatus;
		this.accNumber=accNumber;
		this.initialDeposit=initialDeposit;
		this.balance=initialDeposit;
		
		/*FindCustomer.signUpForm.add(this);
		try {
			AdminMenu.writeToFile(FindCustomer.signUpForm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = initialDeposit;
	}

	
	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
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

	public Boolean getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(Boolean accStatus) {
		this.accStatus = accStatus;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", userName=" + userName
				+ ", password=" + password + ", accountType=" + accountType + ", accStatus=" + accStatus + ", address="
				+ address + ", accNumber=" + accNumber + ", initialDeposit=" + initialDeposit + ", balance=" + balance
				+ "]";
	}


	
	}
	
