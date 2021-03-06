package com.qa.service.repository;

public interface CustomerRepository {
	
	String getCustomer(String USERNAME, String PASSWORD);
	
	String createCustomer(String FIRST_NAME, String SECOND_NAME, String USERNAME, String PASSWORD);

	String checkUniqueUsername(String USERNAME);
}
