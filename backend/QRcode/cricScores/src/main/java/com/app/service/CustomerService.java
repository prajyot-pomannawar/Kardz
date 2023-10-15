package com.app.service;



import com.app.dto.CustomerInfoRequestDTO;
import com.app.dto.CustomerInfoResponseDTO;


public interface CustomerService{
	
	CustomerInfoResponseDTO addCustomerProfile(CustomerInfoRequestDTO request) ;
	CustomerInfoResponseDTO getCustomerProfile(Long customerId);
}
