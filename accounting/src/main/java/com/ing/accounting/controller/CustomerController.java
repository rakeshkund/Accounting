package com.ing.accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.accounting.service.CustomerService;
import com.ing.accounting.vo.CustomerVO;

@RestController
public class CustomerController {
	
@Autowired	
CustomerService customerService;

@GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
//public ResponseEntity<CustomerVO> getUserById() {
	public List<CustomerVO> getUserById() {
    List<CustomerVO> customers = customerService.findAllCustomers();
    
    return customers;
    
		/*
		 * if (StringUtils.isEmpty(customers) || customers.isEmpty()) { return new
		 * ResponseEntity<CustomerVO>(HttpStatus.NOT_FOUND); } return new
		 * ResponseEntity<CustomerVO>(customers, HttpStatus.OK);
		 */
}

}
