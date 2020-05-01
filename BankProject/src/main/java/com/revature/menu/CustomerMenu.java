package com.revature.menu;

import java.util.Scanner;

import com.revature.driver.MainMenuClass;
import com.revature.form.CustomerForm;
import com.revature.service.LogIn;


public class CustomerMenu {
	
	public static void customerMenuMethod() {
		
		System.out.println("===========================");
		System.out.println("===========================");
		System.out.println("   WELCOME USER");
		System.out.println("===========================");
		System.out.println("===========================");
		
		
		System.out.println("[1] If you are a New Costumer");
		System.out.println("[2] If you want to Log In");
		System.out.println("[3] If you want to go back");
		Scanner sca = new Scanner(System.in);
		int choice= sca.nextInt();
	
		if(choice ==1) {
			CustomerForm.UserPrompt();
			
		}else if (choice ==2) {
			LogIn.logInValidation(null);
		}else if (choice ==3) {
			MainMenuClass.mainMenuClass();
		}
	
	}
	
}
