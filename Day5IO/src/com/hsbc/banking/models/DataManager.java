package com.hsbc.banking.models;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataManager {

	private static boolean status;
	
	public static boolean writeData(Account[] account,String filePath) throws IOException
	{
		DataOutputStream dout=null;
		
		
		try {
			dout=new DataOutputStream(new FileOutputStream(filePath));
			for(Account acc : account)
			{
			 dout.writeInt(acc.getAccountNo());
			 dout.writeUTF(acc.getAccountHolderName());
			 dout.writeLong(acc.getBalance());
			}
			status=true;
		} catch (FileNotFoundException e) {
			//throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			dout.close();
		}
 		
		
		
		return status;
	}
	
	
	public static boolean readData(String filePath) throws IOException
	{
		DataInputStream din=null;
		
		
		try {
			din=new DataInputStream(new FileInputStream(filePath));
			while (din.available() > 0) {
			    // read and use data
				System.out.println(din.readInt());
				  System.out.println(din.readUTF());
				  System.out.println(din.readLong());
			}
			  
			status=true;
		} catch (FileNotFoundException e) {
			//throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			din.close();
		}
 		
		
		
		return status;
	}
	
	
	
}
