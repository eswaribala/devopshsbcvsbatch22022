package com.hsbc.banking.app;

import java.io.IOException;
import java.util.Random;

import com.hsbc.banking.models.Account;
import com.hsbc.banking.models.DataManager;

public class DataApp {

	public static void write()
	{
		// TODO Auto-generated method stub
        boolean status=false;
        Account[] accountArray=new Account[5];
        Account account=null;
        
        for(int i=0;i<accountArray.length;i++)
        {
        	account=new Account();
			account.setAccountNo(new Random().nextInt(100000));
			account.setAccountHolderName("Jayanth"+i);
			account.setBalance(new Random().nextInt(100000));
			accountArray[i]=account;
        }
		try {
			status = DataManager.writeData(accountArray, "F:\\HSBCBootcamp\\account.bin");
		    System.out.println(status);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void read()
	{
		// TODO Auto-generated method stub
        boolean status=false;
		
		try {
			status = DataManager.readData("F:\\HSBCBootcamp\\account.bin");
		    System.out.println(status);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		read();
		//write();
		
	}

}
