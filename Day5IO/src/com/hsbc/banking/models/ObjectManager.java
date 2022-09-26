package com.hsbc.banking.models;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectManager {

	private static boolean status;
	public static boolean saveObject(CreditCard[] ccArray, String filePath) throws IOException
	{
		ObjectOutputStream out=null;
		
		try {
			out=new ObjectOutputStream(new FileOutputStream(filePath));
			for(CreditCard cc : ccArray)
			    out.writeObject(cc);
			status=true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			out.close();
		}
		
		
		return status;
	}
	public static boolean readObject(String filePath) throws IOException
	{
		ObjectInputStream in=null;
		
		try {
			in=new ObjectInputStream(new FileInputStream(filePath));
			CreditCard result=null;
			try
			{
			    while(in!=null)
			    {
				    result= (CreditCard) in.readObject();
			        System.out.println(result.getCardNo()+"\t"+result.getCardHolderName()+
						"\t"+result.getCvv()+"\t"+result.getExpiryDate());	
				}
			 }
			 catch(EOFException eof)
			 {
					System.out.println("EOF Reached");
			 }
					
			status=true;
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			in.close();
		}
		
		
		return status;
	}
	
}
