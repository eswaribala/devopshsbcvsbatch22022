package com.hsbc.banking.app;

import com.hsbc.banking.models.FundTransfer;

public class ThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //creating multi threading
		System.out.println(Thread.currentThread().getName());
		
		Thread t1 = new Thread(new FundTransfer("FT1","Parameswari"));
		//Thread t2 = new Thread(new FundTransfer("FT2"));
		t1.start();
		//t2.start();
		
	}

}
