package com.spring.boot.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.spring.boot.project.customeException.ProductNotFoundException;
import com.spring.boot.project.entity.Product;
import com.spring.boot.project.repositry.ProductRepo;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepo repo;
	
	
	// save data in database
	
	public boolean save_product(Product product) {
		
		
//	product.setPassword(bCryptPasswordEncoder().encode(product.getPassword()));	
		
	Product p=	repo.save(product);
	System.out.println("my product "+p);
	if(p!=null) {
		return true;
	}
	return false;

	}
	
	
	public Product getProduct(int id)  {
		
		try {
			Product p=repo.findById(id).get();
			if(p!=null) {
				return p;
			}else {
				
				throw new ProductNotFoundException("Product missing");
			}
	
		} catch (Exception e) {
			
			throw new ProductNotFoundException("Sorry ! This product id is not found. "+id);
			
		}

		
		
	}
	
	
//	public Product getProduct(String name)  {
//		
//		try {
//			Product p=repo.findByName(name);
//			if(p!=null) {
//				return p;
//			}else {
//				
//				throw new ProductNotFoundException("Product missing");
//			}
//			
//		} catch (Exception e) {
//			
//			throw new ProductNotFoundException("Sorry ! This product id is not found. "+name);
//			
//		}
//		
//		
//		
//	}
	
//	
//	@Bean
//	BCryptPasswordEncoder bCryptPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//		
//	}
	

}
