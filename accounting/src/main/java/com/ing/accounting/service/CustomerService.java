package com.ing.accounting.service;

import java.util.List;

import com.ing.accounting.vo.CustomerVO;

public interface CustomerService {
	
	List<CustomerVO> findAllCustomers();

}
