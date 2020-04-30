package com.revature.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.beans.Customer;

public class LogIn {
	public static ArrayList<Customer> signUpForm = new ArrayList<Customer>();
	//public static final String cutomerFile = "output.txt";
	public static void logInValidation(ArrayList<Customer> a) {
	
	Scanner userName = new Scanner (System.in);
	Scanner userPass = new Scanner (System.in);
	
	System.out.println("enter your User name");
	String userInput = userName.nextLine();
	System.out.println("enter your Password");
	String passInput = userPass.nextLine();
	
	
	for (int i = 0; i < a.size(); i++)  {
        System.out.print(a.get(i) + " ");  
        if (a.get(i).getUserName().compareTo(userInput) == 0 && a.get(i).getPassword().compareTo(passInput) == 0) {
            System.out.println("You have successfully logged in");
        }else {
        	System.out.println("Wrong credentials");
        }
	}
		
		/*public static Customer logInValidation(String userName, String password) {
			//Customer c = UserInfo.findCustomerByUsername(inputUsername);
			for (int i = 0; i < signUpForm.size(); i++) {
				String name=signUpForm.get(i).getUserName();
				if(userName.equals(name)) {
					return signUpForm.get(i);
				}
			}
					System.out.println("Warrior not found");
					//Menu.startMenu();
					return null;
					

		
		}*/
	}
	
	
}
