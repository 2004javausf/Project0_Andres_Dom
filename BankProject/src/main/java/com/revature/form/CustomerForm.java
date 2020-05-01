package com.revature.form;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.driver.MainMenuClass;
import com.revature.menu.AdminMenu;
import com.revature.menu.CustomerMenu;

public class CustomerForm {
	public static ArrayList<Customer> signUpForm = new ArrayList<Customer>();
	//Establish method to call UserLogin() to identify if it is a Login or SignUp
		
		/*
		 * private String customerName; private String phoneNumber; private String
		 * userName; private String password; private String accountType; private String
		 * accStatus;
		 */
	
		public static Customer userValues = new Customer();
		public static Scanner scan = new Scanner(System.in);
		public static Scanner o = new Scanner(System.in);
		public static String op = o.nextLine();
		public static boolean value = false;
		@SuppressWarnings("resource")
		public static void UserPrompt() {
			//ArrayList<Customer> signUpForm = new ArrayList<Customer>();
			
			
			
			//int accountNumber=0;
			
			
			System.out.println("Please create your profile.");
			System.out.println("Account type 1)For Single account");
			System.out.println("Account type 2)For Joint account");
			System.out.println("3)To go back to the previous menu");
			int accountType = scan.nextInt();
			//userValues.setAccountType(accountType);
			
			switch(accountType) {
			case 1:
				
				lookCustomer();

			
			break;
			
			case 2: 
				System.out.println("Sorry we are in maintainance");
			break;
			case 3: 
				CustomerMenu.customerMenuMethod();
			break;
			case 4: 
				adminAccount();
			break;
			default:
				
			}
			
			
			
	        //creating folder to store arraList information
			
			FileWriter writer = null;
			try {
				writer = new FileWriter("costumerInfo.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			for(Customer str: signUpForm) {
			  try {
				writer.write(str + System.lineSeparator());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Press 1 to go to Main Menu");
	        Scanner op = new Scanner (System.in);
	        int input = op.nextInt();
	        if (input == 1) {
	        	MainMenuClass.mainMenuClass();
	        }
	        
	        
			
		}
		
		public static void lookCustomer() {
			System.out.println("You need to complete one form");
			///loop to validate the number of forms
			//while(accountType == "1"); {
			System.out.println("Insert Full Name: ");
			String customerName = scan.next();
			userValues.setCustomerName(customerName);
			
			System.out.println("Insert address: ");
			String address = scan.next();
			userValues.setAddress(address);
			
			System.out.println("Insert phone number: ");
			String phoneNumber = scan.next();
			userValues.setPhoneNumber(phoneNumber);
			
			System.out.println("Insert user name: ");
			String userName = scan.next();
			userValues.setUserName(userName);
			
			System.out.println("Insert password: ");
			String password = scan.next();
			userValues.setPassword(password);
			
			//System.out.println("Insert password: ");
			userValues.setAccStatus(value);
			
			
			
			//add account info to ArrayList
			signUpForm.add(userValues);//we added the java bean to an ArrayList
		
			for (int i = 0; i < signUpForm.size(); i++)  {
	            System.out.println(signUpForm.get(i) + " ");         
			}
			System.out.println(userValues.getAccStatus() + " ");
			
			System.out.println("=================================================");
			System.out.println("Thank you, Wait for your account to be approved.");
			System.out.println("=================================================");
		}
		
		public static void adminAccount() {
			
			//validate option 3) of AdminMenu
			
			if (userValues.getAccStatus()==false) {
				System.out.println("Accounts to be approved");
				signUpForm.add(userValues);
				for (int i = 0; i < signUpForm.size(); i++)  {
		            System.out.println(signUpForm.get(i) + " ");         
				}
				
				System.out.println("Would you like to approve this account?");
				System.out.println("1)  Yes");
				System.out.println("2)  No");
				int op = o.nextInt();
				
				if(op == 1) {
					value = true;
					userValues.setAccStatus(value);
					System.out.println(userValues.getAccStatus() + " ");
				}
				if (op == 2) {
					value = false;
					userValues.setAccStatus(value);
				}
			}
			else if(userValues.getAccStatus()==true) {
				System.out.println("Empty List");
			}
			
			
		}
		
		
	
}
