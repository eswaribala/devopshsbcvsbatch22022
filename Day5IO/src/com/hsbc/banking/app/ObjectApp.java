package com.hsbc.banking.app;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

import com.hsbc.banking.models.CreditCard;
import com.hsbc.banking.models.ObjectManager;

public class ObjectApp {

	
	public static void write()
	{
		CreditCard[] ccArray=new CreditCard[5];
		boolean status=false;
		for(int i=0;i<ccArray.length;i++)
		  ccArray[i]=new CreditCard(new Random().nextInt(1000000),"Sunil"+i,
					LocalDate.of(2022, i+1, 1),new Random().nextInt(1000));
				
		
		
		try {
			status = ObjectManager.saveObject(ccArray, "F:\\HSBCBootcamp\\ccArray.txt");
			System.out.println(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void read()
	{
		
		boolean status=false;
		try {
			status = ObjectManager.readObject("F:\\HSBCBootcamp\\ccArray.txt");
			System.out.println(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //write();
		read();
		
		
	}

}
