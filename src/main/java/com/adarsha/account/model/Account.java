package com.adarsha.account.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private long accountNumber;
	private String account_holder_name;
	private double amount;
	private long custamerid;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getCustamerid() {
		return custamerid;
	}
	public void setCustamerid(long custamerid) {
		this.custamerid = custamerid;
	}
	public Account(long accountNumber, String account_holder_name, double amount, long custamerid) {
		super();
		this.accountNumber = accountNumber;
		this.account_holder_name = account_holder_name;
		this.amount = amount;
		this.custamerid = custamerid;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", account_holder_name=" + account_holder_name + ", amount="
				+ amount + ", custamerid=" + custamerid + "]";
	}
	
	
	
}
