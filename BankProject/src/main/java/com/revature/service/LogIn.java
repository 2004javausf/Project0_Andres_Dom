package com.revature.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.beans.Customer;

public class LogIn {
	public static ArrayList<Customer> signUpForm = new ArrayList<Customer>();
	public static void logInValidation() {
	
	Scanner userName = new Scanner (System.in);
	Scanner userPass = new Scanner (System.in);
	
	System.out.println("enter your User name");
	String userInput = userName.nextLine();
	System.out.println("enter your Password");
	String passInput = userPass.nextLine();
	
	for (int i = 0; i < signUpForm.size(); i++)  {
        System.out.print(signUpForm.get(i) + " ");  
        if (signUpForm.get(i).getUserName().compareTo(userInput) == 0 && signUpForm.get(i).getPassword().compareTo(passInput) == 0) {
            System.out.println("You have successfully logged in");
        }else {
        	System.out.println("Wrong credentials");
        }
	}
		
		/*public static Customer findWarriorByName(String userName) {
			for (int i = 0; i < signUpForm.size(); i++) {
				String name=signUpForm.get(i).getName();
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
