package com.revature.menu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.service.FindCustomer;

public class AdminMenu  {
	
	public static void manageCustomers() throws FileNotFoundException  {
		System.out.println("HELLO DEAR ADMIN");
		
		System.out.println("1)View Customer Info");
		System.out.println("2)Change Customer Information");
		System.out.println("3)View Pending Accounts");
		Scanner scan = new Scanner(System.in);
		String op = scan.nextLine();
		
		switch(op) {
		case "1":
			
				readToFile();
			
			break;
		case "2":
			//FindCustomer.findCustomerByName(op);
			break;
		}
	
	}
	
	public static final String writeCustomerFile = "costumerInfo.txt";
	
	public static void writeToFile(List<Customer> a) {
	try {
		ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(writeCustomerFile));
		objectOut.writeObject(a);	   
		objectOut.close();
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e){
		e.printStackTrace();
	}
	
	}
	
	
	//Read to file method
	
	public static void readToFile() throws FileNotFoundException {
	FileReader fr = new FileReader("costumerInfo.txt"); 
		  
		    int i; 
		    try {
				while ((i=fr.read()) != -1) 
				  System.out.print((char) i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		  }
	
	/*public static void readToFile() throws FileNotFoundException  {
		
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(writeCustomerFile));
			FindCustomer.signUpForm = (ArrayList<Customer>) objectIn.readObject();
			objectIn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	
}

	

