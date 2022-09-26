package com.hsbc.banking.models;

import java.time.LocalDate;

public class FundTransfer extends Transaction implements Runnable{
	
    private String tname;
    private String userName;
	public FundTransfer(String name,String userName) {
		//super(name);
		// TODO Auto-generated constructor stub
		this.tname=name;
		this.userName=userName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char ch : this.userName.toCharArray())
		{
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Thread.currentThread().setName(tname);
		System.out.println("\nThread Name-->"+Thread.currentThread().getName());
	}
	private int amount;
	private String mode;
	private LocalDate dot;
	private String from;
	private String to;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public LocalDate getDot() {
		return dot;
	}
	public void setDot(LocalDate dot) {
		this.dot = dot;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
	
	

}
