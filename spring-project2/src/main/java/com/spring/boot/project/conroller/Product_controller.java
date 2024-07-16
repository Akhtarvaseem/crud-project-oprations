package com.spring.boot.project.conroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.project.customeException.ProductNotFoundException;
import com.spring.boot.project.dto.ProductDto;
import com.spring.boot.project.service.ProductService;



@RestController
@RequestMapping("/com-product")
public class Product_controller {

	@Autowired
	ProductService service;
	
	@PostMapping("/save-product")
	public ResponseEntity<?> save_product(@RequestBody ProductDto pd) throws ProductNotFoundException {
		
		boolean f= service.save_product(pd);
		
		return new ResponseEntity<>("Congrats ! your product has been add successfully.", HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProduct(@PathVariable int id) {
		
			return ResponseEntity.ok(service.getProduct(id));
		
		
	}
	
}
