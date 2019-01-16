package com.revature.spark.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spark.beans.Product;
import com.revature.spark.repository.ProductRepository;
import com.revature.spark.todo.AssociateImplementation;

@Service
public class ProductService {

	/**
	 * In Spring, we would likely @Autowired this property.
	 * Just to keep the associate code free of Spring annotations,
	 * we opted to simply instantiate the old-fashioned way.
	 */
	private AssociateImplementation associateImplementation = new AssociateImplementation();
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}

	public Product create(Product product){
		return productRepository.save(product);
	}

	public Product update(Product product){
		return productRepository.save(product);
	}
	
	public void delete(Product product){
		productRepository.delete(product);
	}
	
	public Double sum(){
		return associateImplementation.sum(productRepository.findAll());
	}
	
	public Double min(){
		return associateImplementation.min(productRepository.findAll());
	}
	
	public Double max(){
		return associateImplementation.max(productRepository.findAll());
	}
	
	public Double avg(){
		return associateImplementation.avg(productRepository.findAll());
	}
	
	public Double median(){
		return associateImplementation.median(productRepository.findAll());
	}
	
}
