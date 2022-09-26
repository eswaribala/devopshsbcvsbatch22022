package com.hsbc.banking.models;

import java.io.Serializable;
import java.time.LocalDate;

#modified in feature branch

public class CreditCard implements Serializable{
	
	private long cardNo;
	private String cardHolderName;
	private LocalDate expiryDate;
	private transient int cvv;
	
	public CreditCard(long cardNo, String cardHolderName, LocalDate expiryDate, int cvv) {
		super();
		this.cardNo = cardNo;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	public long getCardNo() {
		return cardNo;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public int getCvv() {
		return cvv;
	}
	

}
