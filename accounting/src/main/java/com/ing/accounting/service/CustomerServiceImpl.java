package com.ing.accounting.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ing.accounting.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public  List<CustomerVO> findAllCustomers() {
		List<CustomerVO> customers = new ArrayList<CustomerVO>();
		CustomerVO custtomer = new CustomerVO();
		custtomer.setFullname("John Doe");
		return customers;
	}
	

}
