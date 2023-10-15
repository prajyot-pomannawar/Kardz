package com.app.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.CustomerInformationDao;
import com.app.dto.CustomerInfoRequestDTO;
import com.app.dto.CustomerInfoResponseDTO;
import com.app.entities.CardComet;

@Service
@Transactional

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerInformationDao customerInformationDao;
	
	@Autowired
	private ModelMapper mapper;

	// Add Customer Profile Details
	@Override
	public CustomerInfoResponseDTO addCustomerProfile(CustomerInfoRequestDTO request) {
		
		CardComet customerPersonalDetails = new CardComet();
		customerPersonalDetails.setCustomerFullName(request.getCustomerFullName());	          
		customerPersonalDetails.setCustomerAddress(request.getCustomerAddress());
		customerPersonalDetails.setCustomerDesignation(request.getCustomerDesignation());
		customerPersonalDetails.setCustomerInformation(request.getCustomerInformation());
		customerPersonalDetails.setCustomerMailId(request.getCustomerMailId());
		customerPersonalDetails.setCustomerMobileNumer(request.getCustomerMobileNumer());
		customerPersonalDetails.setCustomerWebsite(request.getCustomerWebsite());
		customerPersonalDetails.setCustomerInstagramId(request.getCustomerInstagramId());
		customerPersonalDetails.setCustomerWhatsappNumber(request.getCustomerWhatsappNumber());
		customerPersonalDetails.setRegisterDate(request.getRegisterDate());
		customerPersonalDetails.setUrlCoverPhoto(request.getUrlCoverPhoto());
		customerPersonalDetails.setUrlProfilePhoto(request.getUrlProfilePhoto());
		
		CardComet  persistentCust=customerInformationDao.save(customerPersonalDetails);
		return mapper.map(persistentCust, CustomerInfoResponseDTO.class);
	
	}
	
	
	
	// Retrieve Customer Personal Details
	 @Override
	    public CustomerInfoResponseDTO getCustomerProfile(Long customerId) {
	        Optional<CardComet> optionalCustomer = customerInformationDao.findById(customerId);
	        if (optionalCustomer.isPresent()) {
	            CardComet customer = optionalCustomer.get();
	            return mapper.map(customer, CustomerInfoResponseDTO.class);
	        } else {
	            optionalCustomer.orElseThrow(() -> new ResourceNotFoundException("Invalid QR code!!!Please Try Again"));
	            return null;
	        }
	    }
	
}






