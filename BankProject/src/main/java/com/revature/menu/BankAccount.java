package com.revature.menu;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		
				
        Scanner in = new Scanner(System.in);

        int customerOption;

        boolean quit = false;

        double balance = 0;

        do {
        	  System.out.println("What would you like to do?\n");
              System.out.println("[1] Deposit money");
              System.out.println("[2] Withdraw money");
              System.out.println("[3] Check balance");
              System.out.print("[0] Quit: \n");
              customerOption = in.nextInt();
              
              switch (customerOption) {
              case 1:
                    double amount;
                    System.out.print("Amount to deposit: ");
                    amount = in.nextDouble();
                    if (amount <= 0)
                         System.out.println("Can't deposit nonpositive amount.");
                    else {
                         balance += amount;
                         System.out.println("$" + amount + " has been deposited.");
                    }
                    break;
              case 2:
                    System.out.print("Amount to withdraw: ");
                    amount = in.nextDouble();
                    if (amount <= 0 || amount > balance)
                         System.out.println("Withdrawal amount is greater balance. Try again");
                    else {
                         balance -= amount;
                         System.out.println("$" + amount + " has been withdrawn.");
                    }
                    break;
              case 3:
                    System.out.println("Your balance: $" + balance);
                    break;
              case 0:
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

	

