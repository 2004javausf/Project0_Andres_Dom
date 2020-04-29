package com.revature.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 7723467772485569223L;
	
	private String empName;
	private String empID;
	private String userName;
	private String password;
	private String employeeType;
	
	
	public void employee(String empName, String empID, String userName, 
		String password, String employeeType) {
		this.empName=empName;
		this.empID=empID;
		this.userName=userName;
		this.password=password;
		this.employeeType=employeeType;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpID() {
		return empID;
	}


	public void setEmpID(String empID) {
		this.empID = empID;
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


	public String getEmployeeType() {
		return employeeType;
	}


	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	@Override
	public String toString() {
		return "Employee Information [empName=" + empName + ", empID=" + empID + ", userName=" + userName + ", password=" + password
				+ ", EmployeeType=" + employeeType + "]";
	}


}
