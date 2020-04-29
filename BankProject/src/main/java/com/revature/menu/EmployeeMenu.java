package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Admin;

public class EmployeeMenu {
	//this is father class to Admin
	public static void employeeMenu() {
		
		System.out.println("===========================");
		System.out.println("===========================");
		System.out.println("   WELCOME DEAR ASSOCIATE");
		System.out.println("===========================");
		System.out.println("===========================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] If you are an Employee");
		System.out.println("[2] If you are an Admin");
		int choice= sc.nextInt();
	
	
	if(choice ==1) {
		System.out.println("Please log in with your username?");
		System.out.println("Please enter your password?");
	}else if (choice ==2) {
		try {
			Admin.readCustomers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
}
