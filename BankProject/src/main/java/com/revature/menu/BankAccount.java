package com.revature.menu;

import com.revature.beans.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<String> bankUsers = new ArrayList<>();
		
		Customer accData = new Customer();	
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

       
        int customerOption;
        double balance=0.0;
        double amount=0.0;
        
        // Load ArrayList with existing users
        accData.setAccNumber("0001");
        accData.setAccountType("Joint");
        accData.setAccStatus("Pending");
        accData.setCustomerName("Dom");
        accData.setAddress("MI");
        accData.setInitialDeposit(37.23);
        accData.setPassword("123");
        accData.setPhoneNumber("989");
        accData.setUserName("Dom");
        accData.setBalance(27.50);
        
        
        
        
        boolean quit = false;
        //String custInfo = FindCustomer.signUpForm.toString();
        
        FileReader fr = new FileReader("costumerInfo.txt");
       // CustomerInformation info = new CustomerInformation;
        
        
        System.out.println();		
        do {
        	  System.out.println("What would you like to do?\n");
        	  System.out.println("[0] Transfer");
              System.out.println("[1] Deposit money");
              System.out.println("[2] Withdraw money");
              System.out.println("[3] Check balance");
              System.out.print("[4] Quit: \n");
              customerOption = in.nextInt();
              
              switch (customerOption) {
              case 0:
                  
                  System.out.print("Amount to Transfer: ");
                  amount = in.nextDouble();
                  if (amount <= 0)// value is negative
                       System.out.println("Can't deposit nonpositive amount.");
                  else {
                       balance += amount;
                       System.out.println("$" + amount + " has been deposited.");
                  }
                  break;
              case 1:
                    System.out.print("Amount to deposit: ");
                    amount = in.nextDouble();
                    if (amount <= 0)
                         System.out.println("Can't deposit nonpositive amount.");
                    else {
                         balance = accData.getBalance() + amount;
                         System.out.println("$" + amount + " has been deposited.\n");
                         
                         System.out.println("$" + balance + " is your new balance.");
                    }
                    break;
              case 2:
                    System.out.print("Amount to withdraw: ");
                    amount = in.nextDouble();
                    if (amount <= 0 || amount > balance)
                         System.out.println("Withdrawal amount is greater balance. Try again");
                    else {
                    	balance = accData.getBalance() - amount; 
                         System.out.println("$" + amount + " has been withdrawn.");
                    }
                    break;
              case 3:
                    System.out.println("Your balance: $" + accData.getBalance());
                    break;
              case 4:
                    quit = true;
                    break;
              default:
                    System.out.println("Please select one of the options above");
                    break;
              }
              System.out.println();
        } while (!quit);
        System.out.println("Bye!");
  }
	}

	
