package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.CustomerInfoRequestDTO;
import com.app.dto.CustomerInfoResponseDTO;
import com.app.entities.CardComet;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:3000")
    
public class UserController{
	
	@Autowired 
	private CustomerService customerService;
	
	// To add the customer Profile
    @PostMapping("/addprofile")
    public ResponseEntity<CustomerInfoResponseDTO> addCustomerProfile(@RequestBody CustomerInfoRequestDTO request) {
        System.out.println("Add profile of user " + request);
        CustomerInfoResponseDTO responseDTO = customerService.addCustomerProfile(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
    
    // To get the customer details
    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerInfoResponseDTO> getCustomerProfile(@PathVariable Long customerId) {
        CustomerInfoResponseDTO responseDTO = customerService.getCustomerProfile(customerId);
        if (responseDTO != null) {
            return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
