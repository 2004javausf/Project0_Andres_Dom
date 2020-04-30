package com.revature.service;

import java.util.ArrayList;

import com.revature.beans.Customer;

public class FindCustomer {
	public static ArrayList<Customer> signUpForm = new ArrayList<Customer>();
	public static Customer findCustomerByName(String inputName) {
		for (int i = 0; i < signUpForm.size(); i++) {
			String name=signUpForm.get(i).getUserName();
			if(inputName.equals(name)) {
				return signUpForm.get(i);
			}
		}
				System.out.println("Warrior not found");
				//MainMenu.mainMenuClass();
				return null;
			
	
	}

}
