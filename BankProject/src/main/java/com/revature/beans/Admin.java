package com.revature.beans;

import java.io.*;

public class Admin {
	public static void readCustomers() throws Exception {
		System.out.println("HELLO DEAR ADMIN");
		System.out.println("Here are the bank applicants");
		FileReader fr = 
			      new FileReader("C:\\Users\\el_mo\\Desktop\\Git\\Project0_Andres_Dom\\BankProject\\output.txt"); 
			  
			    int i; 
			    while ((i=fr.read()) != -1) 
			      System.out.print((char) i); 
	}

}
