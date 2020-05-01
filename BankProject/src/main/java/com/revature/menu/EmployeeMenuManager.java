package com.revature.menu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.driver.MainMenuClass;
import com.revature.form.CustomerForm;


public class EmployeeMenuManager {

	//public static ArrayList<CustomerForm> values = new ArrayList<CustomerForm>();
	
	public static void manageCustomers() throws FileNotFoundException  {
		ArrayList<Customer> signUpForm;
		CustomerForm userValue = new CustomerForm();
		CustomerForm.signUpForm = new ArrayList<Customer>();
		//userValue();
		System.out.println("HELLO DEAR ADMIN");
		
		System.out.println("1)View Customer Info");
		System.out.println("2)View Pending Accounts");
		//System.out.println("3)Change Customer Information");
		
		Scanner scan = new Scanner(System.in);
		String op = scan.nextLine();
		
		switch(op) {
		case "1":
				readToFile();				
			break;
		case "2":
			CustomerForm.adminAccount();
		break;
		
		
		/*case "3":
			try {
				writeToFile(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;*/
			
		
		
		
	}
		
		System.out.println("Press 1 to go to Main Menu");
        Scanner num = new Scanner (System.in);
        int input = num.nextInt();
        if (input == 1) {
        	MainMenuClass.mainMenuClass();
        }
	
	}
	
	public static final String writeCustomerFile = "costumerInfo.txt";
	
	public static void writeToFile(ArrayList<Customer> signUpForm) throws IOException {
		// Accept a string  
		Scanner write = new Scanner(System.in);
		System.out.println("Write on customer File");
        String str = write.nextLine();
  
        // attach a file to FileWriter  
        FileWriter fw=new FileWriter("costumerInfo.txt", true); 
  
        // read character wise from string and write  
        // into FileWriter  
        for (int i = 0; i < str.length(); i++) 
            fw.write(" "+str.charAt(i)); 
  
        System.out.println("Writing successful"); 
        //close the file  
        fw.close(); 
    
        
        System.out.println("Press 1 to go to Main Menu");
        Scanner op = new Scanner (System.in);
        String input = op.nextLine();
        if (input == "1") {
        	MainMenuClass.mainMenuClass();
        }
    }
	
	
	/*public static void writeToFile(List<Customer> a) {
	try {
		ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(writeCustomerFile));
		objectOut.writeObject(a);	   
		objectOut.close();
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e){
		e.printStackTrace();
	}
	
	}*/
	
	
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

	

