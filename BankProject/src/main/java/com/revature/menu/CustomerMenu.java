package com.revature.menu;

import java.util.Scanner;

import com.revature.form.CustomerForm;

public class CustomerMenu {
	
	public static void customerMenuMethod() {
		
		System.out.println("===========================");
		System.out.println("===========================");
		System.out.println("   WELCOME USER");
		System.out.println("===========================");
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] If you are a New Costumer");
		System.out.println("[2] If you want to Log In");
		int choice= sc.nextInt();
	
	
	if(choice ==1) {
		CustomerForm.UserPrompt();
		
	}else if (choice ==2) {
		//we call to the LogIn method
	}
	
	}
	
}
