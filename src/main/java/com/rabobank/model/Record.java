package com.rabobank.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 
 * @author Gopinath RM
 *
 */
public class Record {

	private int transactionRef;
	private String accountNumber;
	private double startBalance;
	private double mutation;
	private String description;
	private double endBalance;

	public Record() {
	}

	public Record(int transactionRef, String accountNumber, double startBalance, double mutation, String description,
			double endBalance) {
		super();
		this.transactionRef = transactionRef;
		this.accountNumber = accountNumber;
		this.startBalance = startBalance;
		this.mutation = mutation;
		this.description = description;
		this.endBalance = endBalance;
	}

	@XmlAttribute
	public int getTransactionRef() {
		return transactionRef;
	}

	public void setTransactionRef(int transactionRef) {
		this.transactionRef = transactionRef;
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	public double getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(double startBalance) {
		this.startBalance = startBalance;
	}

	
	public double getMutation() {
		return mutation;
	}

	public void setMutation(double mutation) {
		this.mutation = mutation;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public double getEndBalance() {
		return endBalance;
	}

	public void setEndBalance(double endBalance) {
		this.endBalance = endBalance;
	}

}
