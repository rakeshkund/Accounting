package com.ing.accounting.vo;

import java.util.List;

public class CustomerVO {
	private String fullname;
	private String address;
	private String email;
	private List<AccountVO> accountList;
	private double total_balance;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<AccountVO> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<AccountVO> accountList) {
		this.accountList = accountList;
	}
	public double getTotal_balance() {
		return total_balance;
	}
	public void setTotal_balance(double total_balance) {
		this.total_balance = total_balance;
	}

}
