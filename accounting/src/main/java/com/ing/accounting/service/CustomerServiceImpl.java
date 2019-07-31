package com.ing.accounting.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ing.accounting.vo.AccountVO;
import com.ing.accounting.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public  List<CustomerVO> findAllCustomers() {
		List<CustomerVO> customers = new ArrayList<CustomerVO>();
		CustomerVO custtomer = new CustomerVO();
		custtomer.setFullname("John Doe");
		customers.add(custtomer);
		
		AccountVO account = new AccountVO();
		account.setAccountHolderType("Primary");
		account.setAccountType("Payment");
		account.setAmtBal("100.00");
		
		List<AccountVO> accVO1 = new ArrayList<AccountVO>();
		accVO1.add(account);
		
		custtomer.setAccountList(accVO1);
		return customers;
	}
	

}
