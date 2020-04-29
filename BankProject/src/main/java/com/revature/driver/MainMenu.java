package com.revature.driver;

import java.util.Scanner;

import com.revature.menu.CustomerMenu;
import com.revature.menu.EmployeeMenu;

public class MainMenu {
	public static void main(String [] args) {
		System.out.println("===========================");
		System.out.println("===========================");
		System.out.println("   WELCOME TO OUR BANK");
		System.out.println("===========================");
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] If you are a Customer");
		System.out.println("[2] If you are an Employee");
		int choice= sc.nextInt();
		
		if(choice ==1) {
			CustomerMenu.customerMenuMethod();
			}else if (choice ==2) {
			EmployeeMenu.employeeMenu();
		}
	}
	



}
